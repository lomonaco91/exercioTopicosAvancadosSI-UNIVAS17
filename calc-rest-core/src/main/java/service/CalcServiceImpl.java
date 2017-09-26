package service;

public class CalcServiceImpl implements CalculadoraService {
	
	@Override
	public Result sum(int a, int b) {
		int result = a + b;
		return new Result().withA(a).withB(b).withValue(result);
	}
	
	@Override
	public Result subtract(int a, int b) {
		int result = a - b;
		return new Result().withA(a).withB(b).withValue(result);
	}

}
