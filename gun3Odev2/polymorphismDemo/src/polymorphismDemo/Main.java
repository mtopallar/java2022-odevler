package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// polymorphism => Çok biçimlilik
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
//		for (BaseLogger logger : loggers) {
//			logger.log("Log mesajı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
