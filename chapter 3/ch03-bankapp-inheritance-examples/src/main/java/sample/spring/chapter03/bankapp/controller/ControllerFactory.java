package sample.spring.chapter03.bankapp.controller;

public class ControllerFactory {

	//자신에게 전달된 controllerName 인수값에 따라 FixedDepositControllerImpl이나 PersonalBankingControllerImpl 클래스를 생성
	public Object getController(String controllerName) {
		Object controller = null;
		if ("fixedDepositController".equalsIgnoreCase(controllerName)) {
			controller = new FixedDepositControllerImpl();
		}
		if ("personalBankingController".equalsIgnoreCase(controllerName)) {
			controller = new PersonalBankingControllerImpl();
		}
		return controller;
	}
}
