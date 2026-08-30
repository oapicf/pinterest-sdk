package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdvertiserDefinedEventInput
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
 * Request body for creating or updating advertiser defined events
 * @param items List of advertiser defined events to create or update
 */
data class AdvertiserDefinedEventsCreateRequest(

    @field:Valid
    @get:Size(min=1)
    @Schema(required = true, description = "List of advertiser defined events to create or update")
    @param:JsonProperty("items")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<AdvertiserDefinedEventInput>
) {

}

