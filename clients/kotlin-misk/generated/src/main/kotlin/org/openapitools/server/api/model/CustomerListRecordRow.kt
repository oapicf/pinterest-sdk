package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerListRecordRow(
    /** Email address (plain or hashed with SHA1, SHA256, or MD5). */
    val email: kotlin.String? = null,
    /** External ID identifier (not hashed). */
    val externalId: kotlin.String? = null,
    /** Hashed phone number (hashed with SHA1, SHA256, or MD5). */
    val hashedPhoneNumber: kotlin.String? = null,
    /** Hashed pinner ID (hashed with SHA1, SHA256, or MD5). */
    val hashedPinnerId: kotlin.String? = null,
    /** IP address (not hashed). */
    val ipAddress: kotlin.String? = null,
    /** LiveRamp envelope identifier (Base64-encoded, not hashed). */
    val liverampEnvelope: kotlin.String? = null,
    /** Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). */
    val maid: kotlin.String? = null,
    /** User agent string (not hashed). */
    val userAgent: kotlin.String? = null
)
