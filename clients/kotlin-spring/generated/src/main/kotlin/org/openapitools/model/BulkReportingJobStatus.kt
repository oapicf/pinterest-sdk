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
* Possible status for a bulk reporting job
* Values: DOES_NOT_EXIST,FINISHED,IN_PROGRESS,EXPIRED,FAILED,CANCELLED
*/
enum class BulkReportingJobStatus(val value: kotlin.String) {

    @JsonProperty("DOES_NOT_EXIST") DOES_NOT_EXIST("DOES_NOT_EXIST"),
    @JsonProperty("FINISHED") FINISHED("FINISHED"),
    @JsonProperty("IN_PROGRESS") IN_PROGRESS("IN_PROGRESS"),
    @JsonProperty("EXPIRED") EXPIRED("EXPIRED"),
    @JsonProperty("FAILED") FAILED("FAILED"),
    @JsonProperty("CANCELLED") CANCELLED("CANCELLED")
}

