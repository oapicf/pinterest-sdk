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
 * @param id Unique identifier of a business profile.
 * @param permissions Permission levels member or partner has on an asset.
 */
data class InviteAssetsSummaryProfilesInner(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Unique identifier of a business profile.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", description = "Permission levels member or partner has on an asset.")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<kotlin.String>? = null
    ) {

}

