@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerListRecordRow(
    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    @field:JsonProperty("external_id")
    val externalId: kotlin.String? = null,

    @field:JsonProperty("hashed_phone_number")
    val hashedPhoneNumber: kotlin.String? = null,

    @field:JsonProperty("hashed_pinner_id")
    val hashedPinnerId: kotlin.String? = null,

    @field:JsonProperty("ip_address")
    val ipAddress: kotlin.String? = null,

    @field:JsonProperty("liveramp_envelope")
    val liverampEnvelope: kotlin.String? = null,

    @field:JsonProperty("maid")
    val maid: kotlin.String? = null,

    @field:JsonProperty("user_agent")
    val userAgent: kotlin.String? = null,

)
