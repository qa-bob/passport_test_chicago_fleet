import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData



def static runTestCase_0() {
    TestCaseMain.runTestCase('Test Cases/Add Member', new TestCaseBinding('Test Cases/Add Member',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/Delete Member', new TestCaseBinding('Test Cases/Delete Member',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_2() {
    TestCaseMain.runTestCase('Test Cases/Edit Fleet Administrator Profile', new TestCaseBinding('Test Cases/Edit Fleet Administrator Profile',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_3() {
    TestCaseMain.runTestCase('Test Cases/Edit Company Profile', new TestCaseBinding('Test Cases/Edit Company Profile',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/SanityTests')

suiteProperties.put('name', 'SanityTests')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Admin\\Documents\\GitHub\\passport_test_chicago_fleet\\ChicagoFleet\\Reports\\SanityTests\\20171222_233114\\execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('SanityTests', suiteProperties)

TestCaseMain.invokeStartSuite('Test Suites/SanityTests')

(0..3).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

TestCaseMain.invokeEndSuite('Test Suites/SanityTests')

KeywordLogger.getInstance().endSuite('SanityTests', null)
