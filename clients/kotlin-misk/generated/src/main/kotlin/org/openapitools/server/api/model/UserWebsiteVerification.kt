package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserWebsiteVerification(
    /** DNS TXT record to check against for the website to be claimed */
    val dnsTxtRecord: kotlin.String? = null,
    /** A full html file to upload to the website in order for it to be claimed */
    val fileContent: kotlin.String? = null,
    /** File expected to find on the website being claimed */
    val filename: kotlin.String? = null,
    /** Metatag the verification process searchs for the website to be claimed */
    val metatag: kotlin.String? = null,
    /** Code to check against the user claiming the website */
    val verificationCode: kotlin.String? = null
)
