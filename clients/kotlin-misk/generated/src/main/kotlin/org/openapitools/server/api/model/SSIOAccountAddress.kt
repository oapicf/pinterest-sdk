package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOAccountAddress(
    /** Salesforce id for address */
    val addressId: kotlin.String? = null,
    /** Address display */
    val display: kotlin.String? = null,
    /** Legal entity for this insertion order */
    val orderLegalEntity: kotlin.String? = null,
    /** Purpose for which the address is used, usually Billing or Businness */
    val purpose: kotlin.String? = null
)
