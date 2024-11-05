package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DeletePartnerAssetAccessBodyAccessesInner {
    /* Unique identifier of a business partner to update asset access to. */
    String partnerId
    /* Unique identifier of the business asset. */
    String assetId

    enum PartnerTypeEnum {
    
        INTERNAL("INTERNAL"),
        
        EXTERNAL("EXTERNAL")
    
        private final String value
    
        PartnerTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. */
    PartnerTypeEnum partnerType = PartnerTypeEnum.INTERNAL
}
