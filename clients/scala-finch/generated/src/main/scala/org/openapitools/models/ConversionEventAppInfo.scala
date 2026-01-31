package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Object containing information about the application where event occurred.
 * @param appUnderscoreid App ID in Google Play Store, AppStore or other stores.
 * @param appUnderscorename Name of the app. Primarily used for Mobile Apps.
 * @param appUnderscorepackageUnderscorename App package name
 * @param appUnderscorestore The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
 * @param appUnderscoreversion App version. Primarily used for mobile apps
 * @param installUnderscoretime App install time. Unix timestamp in seconds
 * @param userUnderscoreagent User Agent request header. Primarily used for Web events
 * @param windowUnderscoreheight Inner height of the window or viewport.
 * @param windowUnderscorewidth Inner width of the window or viewport.
 */
case class ConversionEventAppInfo(appUnderscoreid: Option[String],
                appUnderscorename: Option[String],
                appUnderscorepackageUnderscorename: Option[String],
                appUnderscorestore: Option[String],
                appUnderscoreversion: Option[String],
                installUnderscoretime: Option[Int],
                userUnderscoreagent: Option[String],
                windowUnderscoreheight: Option[Int],
                windowUnderscorewidth: Option[Int]
                )

object ConversionEventAppInfo {
    /**
     * Creates the codec for converting ConversionEventAppInfo from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventAppInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventAppInfo] = deriveEncoder
}
