package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEventAppInfo(
    /** App ID in Google Play Store, AppStore or other stores. */
    val appId: kotlin.String? = null,
    /** Name of the app. Primarily used for Mobile Apps. */
    val appName: kotlin.String? = null,
    /** App package name */
    val appPackageName: kotlin.String? = null,
    /** The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps */
    val appStore: kotlin.String? = null,
    /** App version. Primarily used for mobile apps */
    val appVersion: kotlin.String? = null,
    /** App install time. Unix timestamp in seconds */
    val installTime: kotlin.Int? = null,
    /** User Agent request header. Primarily used for Web events */
    val userAgent: kotlin.String? = null,
    /** Inner height of the window or viewport. */
    val windowHeight: kotlin.Int? = null,
    /** Inner width of the window or viewport. */
    val windowWidth: kotlin.Int? = null
)
