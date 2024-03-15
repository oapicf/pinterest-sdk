package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ConversionTagType
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
 * @param conversionEvent 
 * @param conversionTagId Id of the tag.
 * @param adAccountId Id of the ad account.
 * @param createdTime Creation date in epoch format.
 */
data class ConversionEventResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("conversion_event") val conversionEvent: ConversionTagType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2614324385652", description = "Id of the tag.")
    @get:JsonProperty("conversion_tag_id") val conversionTagId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549757463328", description = "Id of the ad account.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "1564768710", description = "Creation date in epoch format.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null
) {

}

