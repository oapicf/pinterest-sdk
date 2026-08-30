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
 * @param assetGroupsToDelete 
 */
data class AssetGroupDeletionDelete(

    @get:Size(min=1,max=50) 
    @Schema(required = true, description = "")
    @param:JsonProperty("asset_groups_to_delete")
    @get:JsonProperty("asset_groups_to_delete", required = true) val assetGroupsToDelete: kotlin.collections.List<kotlin.String>
) {

}

