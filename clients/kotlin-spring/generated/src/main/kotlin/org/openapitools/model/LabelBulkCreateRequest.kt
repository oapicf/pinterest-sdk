package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LabelCreateItem
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
 * @param labels Labels that you are applying to the campaign.
 * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
 */
data class LabelBulkCreateRequest(

    @field:Valid
    @Schema(required = true, description = "Labels that you are applying to the campaign.")
    @param:JsonProperty("labels")
    @get:JsonProperty("labels", required = true) val labels: kotlin.collections.List<LabelCreateItem>,

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(required = true, description = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")
    @param:JsonProperty("parent_id")
    @get:JsonProperty("parent_id", required = true) val parentId: kotlin.String
) {

}

