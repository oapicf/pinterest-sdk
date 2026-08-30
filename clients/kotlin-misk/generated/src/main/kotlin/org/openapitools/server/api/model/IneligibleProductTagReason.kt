package org.openapitools.server.api.model

enum class IneligibleProductTagReason {
    PIN_MISSING,
    PIN_IS_PRIVATE,
    PRODUCT_METADATA_MISSING,
    PIN_NOT_FROM_VERIFIED_DOMAIN,
    PIN_NOT_FROM_SAME_USER_AS_HERO_PIN
}
