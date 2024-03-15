package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.UserListType
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
 * @param name Customer list name.
 * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
 * @param listType 
 * @param exceptions Customer list errors.
 */
data class CustomerListRequest(

    @Schema(example = "The Glengarry Glen Ross leads", required = true, description = "Customer list name.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "email1@pinterest.com,email2@pinterest.com,..<more records>", required = true, description = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
    @get:JsonProperty("records", required = true) val records: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("list_type") val listType: UserListType? = "EMAIL",

    @field:Valid
    @Schema(example = "null", description = "Customer list errors.")
    @get:JsonProperty("exceptions") val exceptions: kotlin.Any? = null
) {

}

