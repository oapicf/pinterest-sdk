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
 * Asset ID with permission levels.
 * @param id Unique identifier of a business asset.
 * @param permissions Permission levels member or partner has on an asset.
 */
data class AssetIdWithPermissions(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(min=1,max=20)
    @Schema(example = "549755885175", description = "Unique identifier of a business asset.")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", description = "Permission levels member or partner has on an asset.")
    @param:JsonProperty("permissions")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<kotlin.String>? = null
) {

}

