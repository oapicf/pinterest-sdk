package model

import play.api.libs.json._

/**
  * Object containing information about the application where event occurred.
  * @param appId App ID in Google Play Store, AppStore or other stores.
  * @param appName Name of the app. Primarily used for Mobile Apps.
  * @param appPackageName App package name
  * @param appStore The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
  * @param appVersion App version. Primarily used for mobile apps
  * @param installTime App install time. Unix timestamp in seconds
  * @param userAgent User Agent request header. Primarily used for Web events
  * @param windowHeight Inner height of the window or viewport.
  * @param windowWidth Inner width of the window or viewport.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionEventAppInfo(
  appId: Option[String],
  appName: Option[String],
  appPackageName: Option[String],
  appStore: Option[String],
  appVersion: Option[String],
  installTime: Option[Int],
  userAgent: Option[String],
  windowHeight: Option[Int],
  windowWidth: Option[Int]
)

object ConversionEventAppInfo {
  implicit lazy val conversionEventAppInfoJsonFormat: Format[ConversionEventAppInfo] = Json.format[ConversionEventAppInfo]
}

