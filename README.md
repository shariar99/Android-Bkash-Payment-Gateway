# Android-Bkash-Payment-Gateway


https://github.com/shariar99/Android-Bkash-Payment-Gateway/assets/90522515/f3737fce-822d-4f72-bde8-5db9663e6613


# Bkash Payment Gateway Integration in Android App

This is a guide for integrating the Bkash Payment Gateway in an Android app using WebView and HTML/JS as an asset design file. The integration will be done using the Gson library for Gson request handling. Official documentation from [bKash Developer Portal](https://developer.bka.sh/) and the [bKash pgwClient Demo Android repository](https://github.com/bKash-developer/bkash-pgwClient-demo-android) will be referenced.

## Prerequisites

- Android Studio
- Android SDK
- Kotlin programming knowledge

## Getting Started

1. Clone the [bKash payment Demo Android repository](https://github.com/shariar99/Android-Bkash-Payment-Gateway.git) to your local machine or download the source code as a ZIP file.

2. Open Android Studio and import the project by selecting "Open an existing Android Studio project" and navigating to the cloned repository's directory.

3. Add the Gson library to your project's dependencies. You can do this by adding the following line to your `build.gradle` file:

   ```gradle
   implementation 'com.google.code.gson:gson:2.8.8'
4.Ensure that you have a WebView component in your app's layout file (XML). If not, add the following code to your layout file:
     <WebView
    android:id="@+id/webView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
      />
 Copy the HTML and JS files from the asset directory of the cloned repository to the assets directory of your Android project. Ensure that the filenames and directory structure match exactly.

Update the WebView code in your activity file (Kotlin) to load the HTML file from the assets.
7. **Follow the official documentation** provided by [bKash Developer Portal](https://developer.bka.sh/) to understand the available payment integration options and the necessary data to be passed to the payment gateway.

8. **Make the necessary modifications** to the HTML and JS files in the assets directory based on your payment integration requirements.

9. **Use Gson library** to serialize and deserialize data when communicating between your Android app and the HTML/JS file. You can refer to the Gson library documentation for detailed usage instructions.

10. Run your Android app on an emulator or a physical device to test the Bkash Payment Gateway integration.

## Additional Resources

- [bKash Developer Portal](https://developer.bka.sh/): Official documentation for bKash Payment Gateway integration.
- [bKash pgwClient Demo Android repository](https://github.com/bKash-developer/bkash-pgwClient-demo-android): Official repository with a sample Android app demonstrating the Bkash Payment Gateway integration.

## License

The source code and documentation in this repository are released under the [MIT License](LICENSE). Feel free to modify and use it in your own projects.

## Disclaimer

This README provides an overview of integrating the Bkash Payment Gateway into an Android app using WebView and HTML/JS as an asset design file. However, for the most up-to-date and detailed instructions, please refer to the official documentation provided by bKash.

