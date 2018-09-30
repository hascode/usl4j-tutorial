package com.hascode.tutorial;

import com.codahale.usl4j.Measurement;
import com.codahale.usl4j.Model;
import java.util.Arrays;
import java.util.function.Consumer;

public class SampleUSLCalculation {

  public static void main(String[] args) {
    // measured with ab (apache benchmark) from a spring boot demo app (devmode)
    final double[][] input = {{1, 412.53}, {2, 1355.32}, {3, 2207.16}, {4, 2466.22}, {5, 2549.40},
        {6, 2679.73}};

    final Model model = Arrays.stream(input)
        .map(Measurement.ofConcurrency()::andThroughput)
        .collect(Model.toModel());

    Consumer<Integer> stats = (workers) -> System.out
        .printf("At %-8d workers, expect %5.4f req/sec%n", workers,
            model.throughputAtConcurrency(workers));

    stats.accept(10);
    stats.accept(50);
    stats.accept(100);
    stats.accept(500);
    stats.accept(1_000);
    stats.accept(50_000);
    stats.accept(100_000);
  }
}
