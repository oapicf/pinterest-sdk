/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param partnerId Unique identifier of a business partner to update asset access to.
 * @param assetId Unique identifier of the business asset.
 * @param partnerType If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class DeletePartnerAssetAccessBodyAccessesInner (
    /* Unique identifier of a business partner to update asset access to. */
    @SerializedName("partnerId") private val _partnerId: kotlin.String?,
    /* Unique identifier of the business asset. */
    @SerializedName("assetId") private val _assetId: kotlin.String?,
    /* If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. */
    val partnerType: DeletePartnerAssetAccessBodyAccessesInner.PartnerType? = PartnerType.INTERNAL
) {

    /**
    * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
    * Values: INTERNAL,EXTERNAL
    */
    enum class PartnerType(val value: kotlin.String){
    
        INTERNAL("INTERNAL"),
    
        EXTERNAL("EXTERNAL");
    
    }

        val partnerId get() = _partnerId ?: throw IllegalArgumentException("partnerId is required")
                    
        val assetId get() = _assetId ?: throw IllegalArgumentException("assetId is required")
                    
}

