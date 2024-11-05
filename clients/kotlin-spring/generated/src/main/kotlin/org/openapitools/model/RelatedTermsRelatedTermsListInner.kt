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
 * @param term 
 * @param relatedTerms 
 */
data class RelatedTermsRelatedTermsListInner(

    @Schema(example = "clothes", description = "")
    @get:JsonProperty("term") val term: kotlin.String? = null,

    @Schema(example = "[\"shoes\",\"cute clothes\"]", description = "")
    @get:JsonProperty("related_terms") val relatedTerms: kotlin.collections.List<kotlin.String>? = null
    ) {

}

