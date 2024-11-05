package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
* Status of a leads export job
* Values: IN_PROGRESS,FINISHED,FAILED
*/
enum class LeadsExportStatus(@get:JsonValue val value: kotlin.String) {

    IN_PROGRESS("IN_PROGRESS"),
    FINISHED("FINISHED"),
    FAILED("FAILED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): LeadsExportStatus {
                return values().first{it -> it.value == value}
        }
    }
}

