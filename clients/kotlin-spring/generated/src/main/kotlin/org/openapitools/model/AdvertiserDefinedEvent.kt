package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ConversionTagTypeOptimal
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
 * Advertiser defined event
 * @param mappedConversionType Standard type mapped to ADE for optimization
 * @param name Raw string name of the event, usually logged as raw_event_name in our dataset
 */
data class AdvertiserDefinedEvent(

    @field:Valid
    @Schema(example = "SIGNUP", description = "Standard type mapped to ADE for optimization")
    @param:JsonProperty("mapped_conversion_type")
    @get:JsonProperty("mapped_conversion_type") val mappedConversionType: ConversionTagTypeOptimal? = null,

    @Schema(example = "newsletter_signup", description = "Raw string name of the event, usually logged as raw_event_name in our dataset")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) {

}

