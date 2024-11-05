package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Permissions
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
 * @param partnerId Unique identifier of a business partner to update asset access to.
 * @param assetId Unique identifier of the business asset.
 * @param permissions A non-empty array of permissions to assign to the partner.
 */
data class UpdatePartnerAssetAccessBodyAccessesInner(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(example = "1234567890123", required = true, description = "Unique identifier of a business partner to update asset access to.")
    @get:JsonProperty("partner_id", required = true) val partnerId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(example = "549755885175", required = true, description = "Unique identifier of the business asset.")
    @get:JsonProperty("asset_id", required = true) val assetId: kotlin.String,

    @field:Valid
    @get:Size(min=1,max=50) 
    @Schema(example = "[\"ANALYST\",\"ADMIN\"]", required = true, description = "A non-empty array of permissions to assign to the partner.")
    @get:JsonProperty("permissions", required = true) val permissions: kotlin.collections.List<Permissions>
    ) {

}

