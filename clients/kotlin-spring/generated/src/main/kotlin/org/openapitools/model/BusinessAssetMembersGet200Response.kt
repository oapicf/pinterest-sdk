package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.UserSingleAssetBinding
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
 * @param items List of members with permissions to the asset.
 * @param bookmark 
 */
data class BusinessAssetMembersGet200Response(

    @field:Valid
    @Schema(example = "null", required = true, description = "List of members with permissions to the asset.")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<UserSingleAssetBinding>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bookmark") val bookmark: kotlin.String? = null
    ) {

}

