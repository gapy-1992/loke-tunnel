import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_thank-you_e647b80e-2b34-49b7-895e-49b1939d1856'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/thank-you/e647b80e-2b34-49b7-895e-49b1939d1856')

'step 2: Add visual checkpoint at Page_thank-you_e647b80e-2b34-49b7-895e-49b1939d1856'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00007_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
