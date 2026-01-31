package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;

@Canonical
class PromotionCommon {

    enum DiscountStatusEnum {
    
        OTHER("OTHER"),
        
        ACTIVE("ACTIVE"),
        
        PAUSED("PAUSED"),
        
        SCHEDULED("SCHEDULED"),
        
        EXPIRED("EXPIRED")
    
        private final String value
    
        DiscountStatusEnum(String value) {
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

    /* Discount status based on the current time and start and end time of discount */
    DiscountStatusEnum discountStatus
    /* Promotion end time. Unix timestamp in seconds. Independent of campaign end time. */
    Integer endTime
    /* Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. */
    String externalId
    /* The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. */
    String platformType
    /* Code that can be used to redeem a promotion. */
    String promotionCode
    /* An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. */
    String promotionCustomId
    /* Internal name for the promotion. */
    String promotionTitle
    
    PromotionType promotionType
    /* Promotion start time. Unix timestamp in seconds. Independent of campaign start time. */
    Integer startTime
    /* List of values to be inserted in the promotion type-specific template. */
    List<PromotionTemplateValue> templateValues = new ArrayList<>()
}
