@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEventAppInfo(
    @field:JsonProperty("app_id")
    val appId: kotlin.String? = null,

    @field:JsonProperty("app_name")
    val appName: kotlin.String? = null,

    @field:JsonProperty("app_package_name")
    val appPackageName: kotlin.String? = null,

    @field:JsonProperty("app_store")
    val appStore: kotlin.String? = null,

    @field:JsonProperty("app_version")
    val appVersion: kotlin.String? = null,

    @field:JsonProperty("install_time")
    val installTime: kotlin.Int? = null,

    @field:JsonProperty("user_agent")
    val userAgent: kotlin.String? = null,

    @field:JsonProperty("window_height")
    val windowHeight: kotlin.Int? = null,

    @field:JsonProperty("window_width")
    val windowWidth: kotlin.Int? = null,

)
