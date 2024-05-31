package ITestListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class NetworkRetry implements IRetryAnalyzer{

	int start=0, end=3;
	public boolean retry(ITestResult result) {
		if(start<end) {
			start++;
			return true;
		}
		return false;
	}

}
