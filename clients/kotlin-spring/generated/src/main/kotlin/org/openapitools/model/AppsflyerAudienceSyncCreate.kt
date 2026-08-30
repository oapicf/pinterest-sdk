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
 * Resource create operation model.
 * @param containerId The container ID of the audience
 * @param urlAdidSha256 The pre-signed URL for SHA256 hashed GAID/IDFA file
 * @param urlEmailSha256 The pre-signed URL for SHA256 hashed email file
 */
data class AppsflyerAudienceSyncCreate(

    @Schema(required = true, description = "The container ID of the audience")
    @param:JsonProperty("container_id")
    @get:JsonProperty("container_id", required = true) val containerId: kotlin.String,

    @Schema(description = "The pre-signed URL for SHA256 hashed GAID/IDFA file")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("url_adid_sha256")
    @get:JsonProperty("url_adid_sha256") val urlAdidSha256: kotlin.String? = null,

    @Schema(description = "The pre-signed URL for SHA256 hashed email file")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("url_email_sha256")
    @get:JsonProperty("url_email_sha256") val urlEmailSha256: kotlin.String? = null
) {

}

