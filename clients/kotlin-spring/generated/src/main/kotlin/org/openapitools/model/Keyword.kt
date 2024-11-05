package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MatchTypeResponse
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
 * @param matchType 
 * @param &#x60;value&#x60; Keyword value (120 chars max).
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @param archived 
 * @param id Keyword ID .
 * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
 * @param parentType Parent entity type
 * @param type Always keyword
 */
data class Keyword(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("match_type", required = true) val matchType: MatchTypeResponse?,

    @Schema(example = "null", required = true, description = "Keyword value (120 chars max).")
    @get:JsonProperty("value", required = true) val `value`: kotlin.String,

    @Schema(example = "null", description = "</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
    @get:JsonProperty("bid") val bid: kotlin.Int? = null,

    @Schema(example = "false", description = "")
    @get:JsonProperty("archived") val archived: kotlin.Boolean? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Keyword ID .")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Keyword parent entity ID (advertiser, campaign, ad group).")
    @get:JsonProperty("parent_id") val parentId: kotlin.String? = null,

    @Schema(example = "campaign", description = "Parent entity type")
    @get:JsonProperty("parent_type") val parentType: kotlin.String? = null,

    @Schema(example = "keyword", description = "Always keyword")
    @get:JsonProperty("type") val type: kotlin.String? = null
    ) {

}

