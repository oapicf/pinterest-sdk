package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RelatedTermsRelatedTermsListItems
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
 * @param id First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
 * @param relatedTermCount Total number of related terms returned
 * @param relatedTermsList The id of the advertiser.
 */
data class RelatedTerms(

    @Schema(example = "clothes", description = "First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "2", description = "Total number of related terms returned")
    @param:JsonProperty("related_term_count")
    @get:JsonProperty("related_term_count") val relatedTermCount: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "The id of the advertiser.")
    @param:JsonProperty("related_terms_list")
    @get:JsonProperty("related_terms_list") val relatedTermsList: kotlin.collections.List<RelatedTermsRelatedTermsListItems>? = null
) {

}

