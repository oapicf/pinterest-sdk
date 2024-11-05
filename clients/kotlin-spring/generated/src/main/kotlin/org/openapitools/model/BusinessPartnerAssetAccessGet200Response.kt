package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GetPartnerAssetsResponse
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
 * @param items List assets on which you granted access to your partner or assets on which your partner has granted you access.
 * @param bookmark 
 */
data class BusinessPartnerAssetAccessGet200Response(

    @field:Valid
    @Schema(example = "null", required = true, description = "List assets on which you granted access to your partner or assets on which your partner has granted you access.")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<GetPartnerAssetsResponse>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bookmark") val bookmark: kotlin.String? = null
    ) {

}

