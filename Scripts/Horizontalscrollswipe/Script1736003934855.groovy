import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository

// Start the Easypaisa app (use the correct application ID)
Mobile.startExistingApplication('pk.com.telenor.phoenix')

// Perform a horizontal swipe (from left to right)
// Adjust the coordinates (startX, startY, endX, endY) as needed based on your app's layout
Mobile.swipe(100, 500, 800, 500)

Mobile.delay(2) // Delay for 2 seconds to allow UI updates

// Optional: Verify if a specific element appears after the swipe
// Ensure the test object path is correctly defined in your Object Repository
boolean isElementVisible = Mobile.verifyElementExist(
	ObjectRepository.findTestObject('Object Repository/android.widget.HorizontalScrollView'),
	10
)

Mobile.comment('Swipe action executed; verifying element visibility: ' + isElementVisible)

// Close the application after performing the swipe
Mobile.closeApplication()
