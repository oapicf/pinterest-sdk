package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOAccountPMPName(
    /** Salesforce id for PMP */
    val id: kotlin.String? = null,
    /** Display name */
    val name: kotlin.String? = null
)
