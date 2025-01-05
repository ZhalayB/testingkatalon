package mobile

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption
import java.time.Duration
import com.kms.katalon.core.mobile.driver.MobileDriverFactory

class ScrollActions {
	@Keyword
	def horizontalScroll(int startX, int startY, int endX, int durationInSeconds) {
		// Get the Appium driver
		def driver = MobileDriverFactory.getDriver()

		// Ensure the driver is not null
		if (driver == null) {
			throw new IllegalStateException("Appium driver is not initialized. Please start the application before using this keyword.")
		}

		// Create a TouchAction instance
		TouchAction action = new TouchAction(driver)

		// Perform the swipe action
		action.press(PointOption.point(startX, startY))  // Starting point
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(durationInSeconds)))  // Duration
				.moveTo(PointOption.point(endX, startY))  // Ending point
				.release()  // Release the action
				.perform()  // Execute the swipe
	}
}
