package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.KeywordsCommon
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
 * @param keywords Keyword JSON array. Each array element has 3 fields
 * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
 */
data class KeywordsRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "Keyword JSON array. Each array element has 3 fields")
    @get:JsonProperty("keywords", required = true) val keywords: kotlin.collections.List<KeywordsCommon>,

    @get:Pattern(regexp="^((AG)|C)?\\d+$")
    @Schema(example = "383791336903426391", required = true, description = "Keyword parent entity ID (advertiser, campaign, ad group).")
    @get:JsonProperty("parent_id", required = true) val parentId: kotlin.String
) {

}

