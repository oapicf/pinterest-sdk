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
 * @param code Error code associated with the error editing asset group.
 * @param message Error message associated with the error editing asset group.
 * @param assetGroupId Asset group id of the exception.
 */
data class UpdateAssetGroupResponseExceptionsInner(

    @Schema(example = "29", description = "Error code associated with the error editing asset group.")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @Schema(example = "You are not permitted to access that resource.", description = "Error message associated with the error editing asset group.")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "666791336903426391", description = "Asset group id of the exception.")
    @get:JsonProperty("asset_group_id") val assetGroupId: kotlin.String? = null
    ) {

}

