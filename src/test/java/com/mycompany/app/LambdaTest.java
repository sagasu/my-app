package com.mycompany.app;

import java.util.Arrays;

import org.junit.Test;

public class LambdaTest
{
	@Test
	public void simpleLambda()
    {
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
    }
	
	@Test
	public void Lambda()
    {
		final String separator = ",";
		Arrays.asList( "a", "b", "d" ).forEach(
		  ( String e ) -> System.out.print( e + separator ) );
    }
}
	
