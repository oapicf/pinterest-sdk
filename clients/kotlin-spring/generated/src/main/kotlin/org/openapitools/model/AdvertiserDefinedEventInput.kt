package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdvertiserDefinedEventMappingType
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
 * Advertiser defined event input for create/update operations
 * @param mappedConversionType Pinterest standard event type to map this custom event to for campaign optimization and reporting
 * @param name Raw string name of the event
 */
data class AdvertiserDefinedEventInput(

    @field:Valid
    @Schema(example = "SIGNUP", required = true, description = "Pinterest standard event type to map this custom event to for campaign optimization and reporting")
    @param:JsonProperty("mapped_conversion_type")
    @get:JsonProperty("mapped_conversion_type", required = true) val mappedConversionType: AdvertiserDefinedEventMappingType,

    @Schema(example = "newsletter_signup", required = true, description = "Raw string name of the event")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String
) {

}

