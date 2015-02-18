package sortingprogram;

public class mySortingProgram {
	public void ascending(double x[], int n){
		int m;
		double hold;
		for (int k=0; k<=n-2; ++k){
	     m = k;
		for (int j=k+1; j<=n-1; ++j){
     	 if (x[j] < x[m])
     	m = j;
	}
		hold = x[m];
		x[m] = x[k];
		x[k] = hold;
	}

	for (int i=0;i<=n-1;i++){
		System.out.println(x[i]);
	}
	}
   public void descending(double x[], int n){
		int m;
		double hold;
		for (int k=0; k<=n-2; ++k){
	     m = k;
		for (int j=k+1; j<=n-1; ++j){
     	 if (x[j] > x[m])
     	m = j;
	}
		hold = x[m];
		x[m] = x[k];
		x[k] = hold;
	}

	for (int i=0;i<=n-1;i++){
		System.out.println(x[i]);
	}
	}


}
