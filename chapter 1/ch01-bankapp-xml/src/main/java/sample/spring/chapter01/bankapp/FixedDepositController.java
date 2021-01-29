package sample.spring.chapter01.bankapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositController {
	private static Logger logger = LogManager
			.getLogger(FixedDepositController.class);

	//인스턴스 변수 정의
	private FixedDepositService fixedDepositService;

	public FixedDepositController() {
		logger.info("initializing");
	}

	//fixedDepositService 변수의 자바빈 스타일 세터 메서드로 설정(Setter 기반 DI 예졔)
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		logger.info("Setting fixedDepositService property");
		this.fixedDepositService = fixedDepositService;
	}

	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(
				1, 10000, 365, "someemail@something.com"));
	}

	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}