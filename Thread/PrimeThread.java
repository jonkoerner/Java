class PrimeThread extends Thread {
		long minPrime;
		PrimeThread(long minPrime) {
			this.minPrime = minPrime;
		}
            public static void main(String args[]){
            PrimeRun p = new PrimeRun(143);
            new Thread(p).start();
			}	
	}