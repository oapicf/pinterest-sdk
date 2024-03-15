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
* Entity status
* Values: ACTIVE,PAUSED,ARCHIVED,DRAFT,DELETED_DRAFT
*/
enum class EntityStatus(val value: kotlin.String) {

    @JsonProperty("ACTIVE") ACTIVE("ACTIVE"),
    @JsonProperty("PAUSED") PAUSED("PAUSED"),
    @JsonProperty("ARCHIVED") ARCHIVED("ARCHIVED"),
    @JsonProperty("DRAFT") DRAFT("DRAFT"),
    @JsonProperty("DELETED_DRAFT") DELETED_DRAFT("DELETED_DRAFT")
}

