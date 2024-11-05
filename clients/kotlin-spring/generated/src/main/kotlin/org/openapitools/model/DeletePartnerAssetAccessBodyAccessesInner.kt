package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param partnerType If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
 */
data class DeletePartnerAssetAccessBodyAccessesInner(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(example = "1234567890123", required = true, description = "Unique identifier of a business partner to update asset access to.")
    @get:JsonProperty("partner_id", required = true) val partnerId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(example = "549755885175", required = true, description = "Unique identifier of the business asset.")
    @get:JsonProperty("asset_id", required = true) val assetId: kotlin.String,

    @Schema(example = "INTERNAL", description = "If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.")
    @get:JsonProperty("partner_type") val partnerType: DeletePartnerAssetAccessBodyAccessesInner.PartnerType? = PartnerType.INTERNAL
    ) {

    /**
    * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
    * Values: INTERNAL,EXTERNAL
    */
    enum class PartnerType(@get:JsonValue val value: kotlin.String) {

        INTERNAL("INTERNAL"),
        EXTERNAL("EXTERNAL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PartnerType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

