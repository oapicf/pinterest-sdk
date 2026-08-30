@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UserWebsiteVerification(
    @field:JsonProperty("dns_txt_record")
    val dnsTxtRecord: kotlin.String? = null,

    @field:JsonProperty("file_content")
    val fileContent: kotlin.String? = null,

    @field:JsonProperty("filename")
    val filename: kotlin.String? = null,

    @field:JsonProperty("metatag")
    val metatag: kotlin.String? = null,

    @field:JsonProperty("verification_code")
    val verificationCode: kotlin.String? = null,

)
