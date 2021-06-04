package core.Log.Abstract;

public class LoggerManager extends BaseLogger {
private BaseLogger baseLogger;
	
	public  LoggerManager (BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}
	@Override
	public void logCreate() {
		baseLogger.logCreate();
	}

	@Override
	public void logRead() {
		baseLogger.logRead();
	}

	@Override
	public void logUpdate() {
		baseLogger.logUpdate();
	}

	@Override
	public void logDelete() {
		baseLogger.logDelete();
		
	}

}
