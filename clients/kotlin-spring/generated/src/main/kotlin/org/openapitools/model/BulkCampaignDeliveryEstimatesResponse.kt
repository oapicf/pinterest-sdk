package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BulkCampaignDeliveryEstimatesItem
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
 * Bulk campaign delivery estimates response.
 * @param &#x60;data&#x60; Per-campaign delivery estimate results, in the same order as the request.
 */
data class BulkCampaignDeliveryEstimatesResponse(

    @field:Valid
    @Schema(required = true, description = "Per-campaign delivery estimate results, in the same order as the request.")
    @param:JsonProperty("data")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<BulkCampaignDeliveryEstimatesItem>
) {

}

