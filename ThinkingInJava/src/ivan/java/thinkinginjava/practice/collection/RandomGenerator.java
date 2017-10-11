package ivan.java.thinkinginjava.practice.collection;

import java.util.Random;

import ivan.java.thinkinginjava.practice.util.Generator;

public class RandomGenerator<T> implements Generator<T> {

	public static String[] letters = ("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z")
			.split(",");

	public Random rd = new Random();

	public Integer integer() {
		return rd.nextInt();
	}

	public String String(int length) {
		return letters[rd.nextInt(43)];
	}

	@Override
	public T next() {
		return null;
	}

}
