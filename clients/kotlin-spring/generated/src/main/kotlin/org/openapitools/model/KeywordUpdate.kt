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
 * @param id Keyword ID.
 * @param archived Is keyword archived?
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 */
data class KeywordUpdate(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2886364308355", required = true, description = "Keyword ID.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "false", description = "Is keyword archived?")
    @get:JsonProperty("archived") val archived: kotlin.Boolean? = null,

    @Schema(example = "null", description = "</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
    @get:JsonProperty("bid") val bid: kotlin.Int? = null
    ) {

}

