package first;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class demo {
@Test
public void  as() {
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Reports/Spark.html");
	extent.attachReporter(spark);
	ExtentTest report =extent.createTest("test");
	report.createNode(this.getClass().getName()).log(Status.PASS, "Passed 1st time");
	//report.log(Status.PASS, "Passed passs time");
	report.log(Status.FAIL, "Passed fail time");
	extent.flush();
	Assert.assertTrue(true);
	extent.flush();
	
	System.out.println("Exec");
}

}
