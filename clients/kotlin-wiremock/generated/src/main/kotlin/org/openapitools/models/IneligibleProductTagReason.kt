@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class IneligibleProductTagReason {
    @JsonProperty(value = "PIN_MISSING") PIN_MISSING,
    @JsonProperty(value = "PIN_IS_PRIVATE") PIN_IS_PRIVATE,
    @JsonProperty(value = "PRODUCT_METADATA_MISSING") PRODUCT_METADATA_MISSING,
    @JsonProperty(value = "PIN_NOT_FROM_VERIFIED_DOMAIN") PIN_NOT_FROM_VERIFIED_DOMAIN,
    @JsonProperty(value = "PIN_NOT_FROM_SAME_USER_AS_HERO_PIN") PIN_NOT_FROM_SAME_USER_AS_HERO_PIN,
}
