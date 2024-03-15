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
* Values: NONE,ID,SIZE,CREATION_DATE,UPDATED_TIME,NAME,STATUS,TYPE
*/
enum class GetAudiencesOrderBy(val value: kotlin.String) {

    @JsonProperty("NONE") NONE("NONE"),
    @JsonProperty("ID") ID("ID"),
    @JsonProperty("SIZE") SIZE("SIZE"),
    @JsonProperty("CREATION_DATE") CREATION_DATE("CREATION_DATE"),
    @JsonProperty("UPDATED_TIME") UPDATED_TIME("UPDATED_TIME"),
    @JsonProperty("NAME") NAME("NAME"),
    @JsonProperty("STATUS") STATUS("STATUS"),
    @JsonProperty("TYPE") TYPE("TYPE")
}

