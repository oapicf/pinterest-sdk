package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CampaignBatchResponseData
import org.openapitools.model.Exception
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
 * Item in a batch campaign response.
 * @param `data` Campaign data on success.
 * @param exceptions Exceptions on failure.
 */
data class CampaignBatchItem(

    @field:Valid
    @Schema(description = "Campaign data on success.")
    @param:JsonProperty("data")
    @get:JsonProperty("data") val `data`: CampaignBatchResponseData? = null,

    @field:Valid
    @Schema(description = "Exceptions on failure.")
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<Exception>? = null
) {

}

