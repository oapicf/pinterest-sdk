package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.LabelStatusBulkUpdate
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
 * @param id Label ID.
 * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
 * @param status 
 */
data class LabelBulkUpdateRequest(

    @Schema(required = true, description = "Label ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")
    @param:JsonProperty("parent_id")
    @get:JsonProperty("parent_id", required = true) val parentId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: LabelStatusBulkUpdate
) {

}

