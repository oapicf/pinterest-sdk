@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingSpecOptimal(
    @field:JsonProperty("AGE_BUCKET")
    val AGE_BUCKET: kotlin.collections.List<TargetingSpecAgeBucket>? = null,

    @field:JsonProperty("APPTYPE")
    val APPTYPE: kotlin.collections.List<TargetingSpecAppType>? = null,

    @field:JsonProperty("AUDIENCE_EXCLUDE")
    val AUDIENCE_EXCLUDE: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("AUDIENCE_INCLUDE")
    val AUDIENCE_INCLUDE: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("GENDER")
    val GENDER: kotlin.collections.List<TargetingSpecGender>? = null,

    @field:JsonProperty("GEO")
    val GEO: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("GEO_EXCLUDE")
    val GEO_EXCLUDE: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("INTEREST")
    val INTEREST: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("LOCALE")
    val LOCALE: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("LOCATION")
    val LOCATION: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("LOCATION_EXCLUDE")
    val LOCATION_EXCLUDE: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("MAXIMUM_AGE")
    val MAXIMUM_AGE: kotlin.String? = null,

    @field:JsonProperty("MINIMUM_AGE")
    val MINIMUM_AGE: kotlin.String? = null,

    @field:JsonProperty("SHOPPING_RETARGETING")
    val SHOPPING_RETARGETING: kotlin.collections.List<TargetingSpecShoppingRetargeting>? = null,

    @field:JsonProperty("TARGETING_STRATEGY")
    val TARGETING_STRATEGY: kotlin.collections.List<TargetingStrategy>? = null,

)
