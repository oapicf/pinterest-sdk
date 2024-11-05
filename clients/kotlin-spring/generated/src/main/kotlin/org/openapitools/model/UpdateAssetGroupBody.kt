package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.UpdateAssetGroupBodyAssetGroupsToUpdateInner
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
 * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them.
 */
data class UpdateAssetGroupBody(

    @field:Valid
    @Schema(example = "null", description = "A list of asset groups and the data that will be used to update them.")
    @get:JsonProperty("asset_groups_to_update") val assetGroupsToUpdate: kotlin.collections.List<UpdateAssetGroupBodyAssetGroupsToUpdateInner>? = null
    ) {

}

