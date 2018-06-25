package singleLayerNeuralNetworks;

import java.util.Random;

import util.GaussianDistribution;

public class Perceptrons {
	

	
	public static void main(String[] args) {
		 final Random rng = new Random(1234);  // seed random
			
		 final int train_N = 1000; // number of training data
		 final int test_N = 200; 	// number of test data
		 final int nIn = 2; 	// dimensions of input data
			
		 double[][] train_X = new double[train_N][nIn]; //input data for training
		 int[] train_T = new int[train_N]; //output data (label) for training
			
		 double[][] test_X = new double[test_N][nIn]; //input data for test
		 int[] test_T = new int[test_N]; //label of inputs
		 int[] predicted_T = new int[test_N]; //output data predicted by the model
			
		 final int epochs = 2000; //maximum training epochs
		 final double learningRate =1.; //learning rate can be 1 in perceptrons.
			
		
		 GaussianDistribution g1 = new GaussianDistribution(-2.0, 1.0, rng);
		 GaussianDistribution g2 = new GaussianDistribution(2.0, 1.0, rng);
	}
	
}
