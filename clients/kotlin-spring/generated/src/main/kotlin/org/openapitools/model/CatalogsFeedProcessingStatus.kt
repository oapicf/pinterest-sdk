package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Values: COMPLETED,COMPLETED_EARLY,DISAPPROVED,FAILED,PROCESSING,QUEUED_FOR_PROCESSING,UNDER_APPEAL,UNDER_REVIEW
*/
enum class CatalogsFeedProcessingStatus(val value: kotlin.String) {

    @JsonProperty("COMPLETED") COMPLETED("COMPLETED"),
    @JsonProperty("COMPLETED_EARLY") COMPLETED_EARLY("COMPLETED_EARLY"),
    @JsonProperty("DISAPPROVED") DISAPPROVED("DISAPPROVED"),
    @JsonProperty("FAILED") FAILED("FAILED"),
    @JsonProperty("PROCESSING") PROCESSING("PROCESSING"),
    @JsonProperty("QUEUED_FOR_PROCESSING") QUEUED_FOR_PROCESSING("QUEUED_FOR_PROCESSING"),
    @JsonProperty("UNDER_APPEAL") UNDER_APPEAL("UNDER_APPEAL"),
    @JsonProperty("UNDER_REVIEW") UNDER_REVIEW("UNDER_REVIEW")
}

