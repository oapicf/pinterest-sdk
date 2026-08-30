package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AppsflyerPlatform
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
 * Request model for creating an AppsFlyer audience
 * @param containerId The ID of the audience container
 * @param name The name of the audience
 * @param platform The platform of the audience
 */
data class AppsflyerAudience(

    @Schema(required = true, readOnly = true, description = "The ID of the audience container")
    @param:JsonProperty("container_id")
    @get:JsonProperty("container_id", required = true) val containerId: kotlin.String,

    @Schema(required = true, description = "The name of the audience")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The platform of the audience")
    @param:JsonProperty("platform")
    @get:JsonProperty("platform", required = true) val platform: AppsflyerPlatform
) {

}

