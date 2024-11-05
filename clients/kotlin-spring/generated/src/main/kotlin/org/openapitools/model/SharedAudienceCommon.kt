package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OperationType
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
 * @param audienceId Unique identifier of an audience
 * @param operationType 
 */
data class SharedAudienceCommon(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2542621871096", description = "Unique identifier of an audience")
    @get:JsonProperty("audience_id") val audienceId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("operation_type") val operationType: OperationType? = null
    ) {

}

