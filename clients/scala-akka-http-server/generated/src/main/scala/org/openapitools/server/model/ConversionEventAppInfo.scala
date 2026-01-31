package org.openapitools.server.model


/**
 * Object containing information about the application where event occurred.
 *
 * @param appId App ID in Google Play Store, AppStore or other stores. for example: ''429047995''
 * @param appName Name of the app. Primarily used for Mobile Apps. for example: ''MyAwesomeApp''
 * @param appPackageName App package name for example: ''com.company.myawesomeapp''
 * @param appStore The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps for example: ''Google Play Store''
 * @param appVersion App version. Primarily used for mobile apps for example: ''7.9''
 * @param installTime App install time. Unix timestamp in seconds for example: ''1739222269''
 * @param userAgent User Agent request header. Primarily used for Web events for example: ''Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36''
 * @param windowHeight Inner height of the window or viewport. for example: ''900''
 * @param windowWidth Inner width of the window or viewport. for example: ''1678''
*/
final case class ConversionEventAppInfo (
  appId: Option[String] = None,
  appName: Option[String] = None,
  appPackageName: Option[String] = None,
  appStore: Option[String] = None,
  appVersion: Option[String] = None,
  installTime: Option[Int] = None,
  userAgent: Option[String] = None,
  windowHeight: Option[Int] = None,
  windowWidth: Option[Int] = None
)

