package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MatchType
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
 * @param id Keyword ID .
 * @param matchType Keyword [match type](/docs/api-features/targeting-overview/)
 * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
 * @param `value` Keyword value (120 chars max).
 * @param archived 
 * @param bid **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @param parentType Parent entity type (advertiser, campaign, ad group).
 * @param type Always keyword
 */
data class Keyword(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", required = true, description = "Keyword ID .")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "Keyword [match type](/docs/api-features/targeting-overview/)")
    @param:JsonProperty("match_type", required = true)
    @get:JsonProperty("match_type", required = true) val matchType: MatchType?,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", required = true, readOnly = true, description = "Keyword parent entity ID (advertiser, campaign, ad group).")
    @param:JsonProperty("parent_id", required = true)
    @get:JsonProperty("parent_id", required = true) val parentId: kotlin.String,

    @Schema(required = true, description = "Keyword value (120 chars max).")
    @param:JsonProperty("value", required = true)
    @get:JsonProperty("value", required = true) val `value`: kotlin.String,

    @Schema(example = "false", description = "")
    @param:JsonProperty("archived")
    @get:JsonProperty("archived") val archived: kotlin.Boolean? = null,

    @Schema(description = "**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
    @param:JsonProperty("bid")
    @get:JsonProperty("bid") val bid: kotlin.Int? = null,

    @Schema(example = "campaign", readOnly = true, description = "Parent entity type (advertiser, campaign, ad group).")
    @param:JsonProperty("parent_type")
    @get:JsonProperty("parent_type") val parentType: kotlin.String? = null,

    @Schema(example = "keyword", readOnly = true, description = "Always keyword")
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null
) {

}

