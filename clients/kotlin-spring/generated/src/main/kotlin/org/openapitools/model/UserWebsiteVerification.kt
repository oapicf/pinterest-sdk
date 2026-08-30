package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param dnsTxtRecord DNS TXT record to check against for the website to be claimed
 * @param fileContent A full html file to upload to the website in order for it to be claimed
 * @param filename File expected to find on the website being claimed
 * @param metatag Metatag the verification process searchs for the website to be claimed
 * @param verificationCode Code to check against the user claiming the website
 */
data class UserWebsiteVerification(

    @Schema(description = "DNS TXT record to check against for the website to be claimed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("dns_txt_record")
    @get:JsonProperty("dns_txt_record") val dnsTxtRecord: kotlin.String? = null,

    @Schema(description = "A full html file to upload to the website in order for it to be claimed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("file_content")
    @get:JsonProperty("file_content") val fileContent: kotlin.String? = null,

    @Schema(description = "File expected to find on the website being claimed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("filename")
    @get:JsonProperty("filename") val filename: kotlin.String? = null,

    @Schema(description = "Metatag the verification process searchs for the website to be claimed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("metatag")
    @get:JsonProperty("metatag") val metatag: kotlin.String? = null,

    @Schema(description = "Code to check against the user claiming the website")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("verification_code")
    @get:JsonProperty("verification_code") val verificationCode: kotlin.String? = null
) {

}

