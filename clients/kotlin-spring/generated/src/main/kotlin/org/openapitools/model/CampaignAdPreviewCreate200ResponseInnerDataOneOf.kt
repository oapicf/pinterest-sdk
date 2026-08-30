package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PinterestLibError
import com.fasterxml.jackson.annotation.JsonInclude
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
 * @param exceptions 
 */
data class CampaignAdPreviewCreate200ResponseInnerDataOneOf(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions", required = true) val exceptions: PinterestLibError
) : CampaignAdPreviewCreate200ResponseInnerData {

}

