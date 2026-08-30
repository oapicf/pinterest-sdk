package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

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
data class ConversionEventAppInfo(

    @get:Size(max=200)
    @Schema(example = "429047995", description = "App ID in Google Play Store, AppStore or other stores.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("app_id")
    @get:JsonProperty("app_id") val appId: kotlin.String? = null,

    @get:Size(max=200)
    @Schema(example = "MyAwesomeApp", description = "Name of the app. Primarily used for Mobile Apps.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("app_name")
    @get:JsonProperty("app_name") val appName: kotlin.String? = null,

    @get:Size(max=200)
    @Schema(example = "com.company.myawesomeapp", description = "App package name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("app_package_name")
    @get:JsonProperty("app_package_name") val appPackageName: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "Google Play Store", description = "The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("app_store")
    @get:JsonProperty("app_store") val appStore: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "7.9", description = "App version. Primarily used for mobile apps")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("app_version")
    @get:JsonProperty("app_version") val appVersion: kotlin.String? = null,

    @get:Min(value=0)
    @Schema(example = "1739222269", description = "App install time. Unix timestamp in seconds")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("install_time")
    @get:JsonProperty("install_time") val installTime: kotlin.Int? = null,

    @get:Size(max=16384)
    @Schema(example = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36", description = "User Agent request header. Primarily used for Web events")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user_agent")
    @get:JsonProperty("user_agent") val userAgent: kotlin.String? = null,

    @get:Min(value=0)
    @get:Max(value=30720)
    @Schema(example = "900", description = "Inner height of the window or viewport.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("window_height")
    @get:JsonProperty("window_height") val windowHeight: kotlin.Int? = null,

    @get:Min(value=0)
    @get:Max(value=30720)
    @Schema(example = "1678", description = "Inner width of the window or viewport.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("window_width")
    @get:JsonProperty("window_width") val windowWidth: kotlin.Int? = null
) {

}

