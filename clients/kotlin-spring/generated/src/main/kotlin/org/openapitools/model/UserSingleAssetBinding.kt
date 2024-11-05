package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BusinessAccessUserSummary
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
 * An object containing the permissions a business member/partner has on the asset.
 * @param permissions Permission levels member or partner has on an asset.
 * @param user 
 */
data class UserSingleAssetBinding(

    @Schema(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", description = "Permission levels member or partner has on an asset.")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("user") val user: BusinessAccessUserSummary? = null
    ) {

}

