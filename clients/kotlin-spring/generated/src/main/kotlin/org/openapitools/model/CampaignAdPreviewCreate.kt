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
 * Resource create operation model.
 * @param adGroupId Ad group ID to create a preview record for.
 */
data class CampaignAdPreviewCreate(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(example = "1234567890", required = true, description = "Ad group ID to create a preview record for.")
    @param:JsonProperty("ad_group_id")
    @get:JsonProperty("ad_group_id", required = true) val adGroupId: kotlin.String
) {

}

