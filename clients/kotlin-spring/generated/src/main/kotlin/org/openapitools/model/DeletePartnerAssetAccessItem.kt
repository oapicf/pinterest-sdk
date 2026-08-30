package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * @param assetId Unique identifier of the business asset.
 * @param partnerId Unique identifier of a business partner to update asset access to.
 * @param partnerType If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
 */
data class DeletePartnerAssetAccessItem(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(required = true, description = "Unique identifier of the business asset.")
    @param:JsonProperty("asset_id")
    @get:JsonProperty("asset_id", required = true) val assetId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(required = true, description = "Unique identifier of a business partner to update asset access to.")
    @param:JsonProperty("partner_id")
    @get:JsonProperty("partner_id", required = true) val partnerId: kotlin.String,

    @Schema(description = "If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_type")
    @get:JsonProperty("partner_type") val partnerType: DeletePartnerAssetAccessItem.PartnerType? = PartnerType.INTERNAL
) {

    /**
    * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
    * Values: INTERNAL,EXTERNAL
    */
    enum class PartnerType(@get:JsonValue val value: kotlin.String) {

        INTERNAL("INTERNAL"),
        EXTERNAL("EXTERNAL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PartnerType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PartnerType'")
            }
        }
    }

}

