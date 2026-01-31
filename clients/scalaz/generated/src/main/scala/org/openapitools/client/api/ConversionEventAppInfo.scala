package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventAppInfo._

case class ConversionEventAppInfo (
  /* App ID in Google Play Store, AppStore or other stores. */
  appId: Option[String],
/* Name of the app. Primarily used for Mobile Apps. */
  appName: Option[String],
/* App package name */
  appPackageName: Option[String],
/* The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps */
  appStore: Option[String],
/* App version. Primarily used for mobile apps */
  appVersion: Option[String],
/* App install time. Unix timestamp in seconds */
  installTime: Option[Integer],
/* User Agent request header. Primarily used for Web events */
  userAgent: Option[String],
/* Inner height of the window or viewport. */
  windowHeight: Option[Integer],
/* Inner width of the window or viewport. */
  windowWidth: Option[Integer])

object ConversionEventAppInfo {
  import DateTimeCodecs._

  implicit val ConversionEventAppInfoCodecJson: CodecJson[ConversionEventAppInfo] = CodecJson.derive[ConversionEventAppInfo]
  implicit val ConversionEventAppInfoDecoder: EntityDecoder[ConversionEventAppInfo] = jsonOf[ConversionEventAppInfo]
  implicit val ConversionEventAppInfoEncoder: EntityEncoder[ConversionEventAppInfo] = jsonEncoderOf[ConversionEventAppInfo]
}
