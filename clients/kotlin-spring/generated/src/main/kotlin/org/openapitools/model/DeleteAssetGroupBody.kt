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
 * Request body used to delete asset groups
 * @param assetGroupsToDelete List of ids of asset groups to be deleted
 */
data class DeleteAssetGroupBody(

    @get:Size(min=1,max=50) 
    @Schema(example = "[\"666791336903426391\",\"666791336903426392\"]", required = true, description = "List of ids of asset groups to be deleted")
    @get:JsonProperty("asset_groups_to_delete", required = true) val assetGroupsToDelete: kotlin.collections.List<kotlin.String>
    ) {

}

