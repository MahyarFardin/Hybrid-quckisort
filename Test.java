class Test {
	public static double parent(int number) {

		int a[] = new int[500000];
		int b[]= new int[500000];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10000);
			b[i] = (int) (Math.random() * 10000);
		}


		long start = 0;
		long end = 0;

		// if you want to see result of application use this part

		// System.out.println("================ Start ================");
		// System.out.println("***Times are in millisecond***\n");
		// start = System.currentTimeMillis();
		// NewQuicksort.newQuicksort(a, 0, a.length - 1, 50);
		// end = System.currentTimeMillis();

		// double timeNewQuicksort=(int)(end-start);
		// System.out.println("NewQuicksort: "+timeNewQuicksort);

		// start = System.currentTimeMillis();
		// QuickSort.quickSort(b, 0, a.length - 1);
		// end = System.currentTimeMillis();

		// double timeQuicksort=(int)(end-start);
		// System.out.println("Quicksort: "+timeQuicksort);

		// System.out.println("NewQuicksort/Quicksort: "+((timeQuicksort)/(timeNewQuicksort)));
		// return 0.0;

		// this part is used to find the best k 

		start = System.currentTimeMillis();
		NewQuicksort.newQuicksort(a, 0, a.length - 1, number);
		end = System.currentTimeMillis();

		double timeNewQuicksort=(int)(end-start);

		start = System.currentTimeMillis();
		QuickSort.quickSort(b, 0, a.length - 1);
		end = System.currentTimeMillis();

		double timeQuicksort=(int)(end-start);

		return timeQuicksort/timeNewQuicksort;

	}
}