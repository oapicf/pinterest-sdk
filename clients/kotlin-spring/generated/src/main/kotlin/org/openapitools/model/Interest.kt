package org.openapitools.model

import java.util.Objects
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
 * @param canonicalUrl 
 * @param id 
 * @param key 
 * @param name 
 */
data class Interest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("canonical_url") val canonicalUrl: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "903972677830", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "man cave", description = "")
    @get:JsonProperty("key") val key: kotlin.String? = null,

    @Schema(example = "Man cave", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null
    ) {

}

