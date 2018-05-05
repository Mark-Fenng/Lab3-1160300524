package helper;

import graph.Graph;

import java.util.Scanner;

abstract class Command {
    protected Graph graph;

    Command(Graph g) {
        graph = g;
    }

    abstract void add(String[] args);

    abstract void delete(String[] args);

    static boolean confirm() {
        System.err.println("Are you sure to delete them? (Yes/no)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return input.equals("y") || input.equals("Y") || input.equals("yes") || input.equals("Yes");
    }
}