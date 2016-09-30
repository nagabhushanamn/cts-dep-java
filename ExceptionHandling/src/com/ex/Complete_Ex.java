package com.ex;

class TransferException extends Exception {

	private String message;

	public TransferException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}

class TransferServiceImpl {

	public String doTxr(double amount, String fromAcc, String toAcc) throws TransferException {

		// load from account

		double fromAccBalance = 100.00;

		if (fromAccBalance < amount) {
			// throw new TransferException("you dont have enough balance");
			// throw new OutOfMemoryError();
		}

		// load to account

		// debit & credit

		// update both accounts

		return " Txr success ";

	}

}

public class Complete_Ex {

	public static void main(String[] args) {

		// User-module

		TransferServiceImpl transferService = new TransferServiceImpl();
		try {
			String status = transferService.doTxr(100000.00, "234234234", "35324356");
			System.out.println(status);
		} catch (TransferException te) {
			System.out.println("Ex handled");
			System.out.println(te.getMessage());
		} catch (Error e) {
			System.out.println("Handled Error");
		}

		System.out.println("with other work...");

	}

}
