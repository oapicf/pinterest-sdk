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
 * @param assetGroupId Asset group id of the exception.
 * @param code Error code associated with the error deleting asset group.
 * @param message Error message associated with the error deleting asset group.
 */
data class AssetGroupDeleteError(

    @Schema(description = "Asset group id of the exception.")
    @param:JsonProperty("asset_group_id")
    @get:JsonProperty("asset_group_id") val assetGroupId: kotlin.String? = null,

    @Schema(description = "Error code associated with the error deleting asset group.")
    @param:JsonProperty("code")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @Schema(description = "Error message associated with the error deleting asset group.")
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null
) {

}

