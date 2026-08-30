package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * @param adAccountId Id of the ad account.
 * @param conversionEvent 
 * @param conversionTagId Id of the tag.
 * @param createdTime Creation date in epoch format.
 * @param reportingConversionEvent For advertiser-defined events, the reporting event label shown in optimization UIs.
 */
data class ConversionEventResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549757463328", description = "Id of the ad account.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_event")
    @get:JsonProperty("conversion_event") val conversionEvent: ConversionTagType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2614324385652", description = "Id of the tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_tag_id")
    @get:JsonProperty("conversion_tag_id") val conversionTagId: kotlin.String? = null,

    @Schema(example = "1564768710", description = "Creation date in epoch format.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @Schema(example = "GET_QUOTE", description = "For advertiser-defined events, the reporting event label shown in optimization UIs.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("reporting_conversion_event")
    @get:JsonProperty("reporting_conversion_event") val reportingConversionEvent: kotlin.String? = null
) {

}

