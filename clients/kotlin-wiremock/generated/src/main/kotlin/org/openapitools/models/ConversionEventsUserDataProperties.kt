@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEventsUserDataProperties(
    @field:JsonProperty("click_id")
    val clickId: kotlin.String? = null,

    @field:JsonProperty("client_ip_address")
    val clientIpAddress: kotlin.String? = null,

    @field:JsonProperty("client_user_agent")
    val clientUserAgent: kotlin.String? = null,

    @field:JsonProperty("country")
    val country: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("ct")
    val ct: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("db")
    val db: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("em")
    val em: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("external_id")
    val externalId: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("fn")
    val fn: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("ge")
    val ge: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("hashed_maids")
    val hashedMaids: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("ln")
    val ln: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("partner_id")
    val partnerId: kotlin.String? = null,

    @field:JsonProperty("ph")
    val ph: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("st")
    val st: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("zp")
    val zp: kotlin.collections.List<kotlin.String>? = null,

)
