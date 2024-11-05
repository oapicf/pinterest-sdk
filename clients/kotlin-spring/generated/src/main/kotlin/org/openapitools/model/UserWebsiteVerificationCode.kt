package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param verificationCode Code to check against the user claiming the website
 * @param dnsTxtRecord DNS TXT record to check against for the website to be claimed
 * @param metatag Metatag the verification process searchs for the website to be claimed
 * @param filename File expected to find on the website being claimed
 * @param fileContent A full html file to upload to the website in order for it to be claimed
 */
data class UserWebsiteVerificationCode(

    @Schema(example = "e1edcc1a43976c646367e9c6c9a9b7b6", description = "Code to check against the user claiming the website")
    @get:JsonProperty("verification_code") val verificationCode: kotlin.String? = null,

    @Schema(example = "pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6", description = "DNS TXT record to check against for the website to be claimed")
    @get:JsonProperty("dns_txt_record") val dnsTxtRecord: kotlin.String? = null,

    @Schema(example = "<meta name=\"p:domain_verify\" content=\"e1edcc1a43976c646367e9c6c9a9b7b6\"/>", description = "Metatag the verification process searchs for the website to be claimed")
    @get:JsonProperty("metatag") val metatag: kotlin.String? = null,

    @Schema(example = "pinterest-e1edc.html", description = "File expected to find on the website being claimed")
    @get:JsonProperty("filename") val filename: kotlin.String? = null,

    @Schema(example = "null", description = "A full html file to upload to the website in order for it to be claimed")
    @get:JsonProperty("file_content") val fileContent: kotlin.String? = null
    ) {

}

