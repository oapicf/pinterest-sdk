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
 * @param campaignIds List of campaign ids
 */
data class CampaignIdFilter(

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "List of campaign ids")
    @get:JsonProperty("campaign_ids") val campaignIds: kotlin.collections.List<kotlin.String>? = null
) {

}

