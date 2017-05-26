package org.agoncal.sample.jmh.test;

import org.agoncal.sample.jmh.MyBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Test {
	public static void main(String[] args) throws RunnerException {
	    Options opt = new OptionsBuilder()
	            .include(MyBenchmark.class.getSimpleName())
	            .forks(1)
	            .build();
	    new Runner(opt).run();
	}
}
