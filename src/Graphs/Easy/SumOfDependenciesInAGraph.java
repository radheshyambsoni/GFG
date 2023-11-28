package Graphs.Easy;

import java.util.ArrayList;

// Sum of dependencies in a graph
// https://www.geeksforgeeks.org/problems/sum-of-dependencies-in-a-graph5311/1
// Nov 28, 2023

public class SumOfDependenciesInAGraph {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int sumNoD = 0;
        for (int i = 0; i < adj.size(); i++) {
            sumNoD += adj.get(i).size();
        }

        return sumNoD;
    }
};