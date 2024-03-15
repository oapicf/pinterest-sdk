package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AdsCreditDiscountsResponse {
    /* True if the offer code is currently active. */
    Boolean active
    /* Advertiser ID the offer was applied to. */
    String advertiserId

    enum DiscountTypeEnum {
    
        COUPON("COUPON"),
        
        CREDIT("CREDIT"),
        
        COUPON_APPLIED("COUPON_APPLIED"),
        
        CREDIT_APPLIED("CREDIT_APPLIED"),
        
        MARKETING_OFFER_CREDIT("MARKETING_OFFER_CREDIT"),
        
        MARKETING_OFFER_CREDIT_APPLIED("MARKETING_OFFER_CREDIT_APPLIED"),
        
        GOODWILL_CREDIT("GOODWILL_CREDIT"),
        
        GOODWILL_CREDIT_APPLIED("GOODWILL_CREDIT_APPLIED"),
        
        INTERNAL_CREDIT("INTERNAL_CREDIT"),
        
        INTERNAL_CREDIT_APPLIED("INTERNAL_CREDIT_APPLIED"),
        
        PREPAID_CREDIT("PREPAID_CREDIT"),
        
        PREPAID_CREDIT_APPLIED("PREPAID_CREDIT_APPLIED"),
        
        SALES_INCENTIVE_CREDIT("SALES_INCENTIVE_CREDIT"),
        
        SALES_INCENTIVE_CREDIT_APPLIED("SALES_INCENTIVE_CREDIT_APPLIED"),
        
        CREDIT_EXPIRED("CREDIT_EXPIRED"),
        
        FUTURE_CREDIT("FUTURE_CREDIT"),
        
        REFERRAL_CREDIT("REFERRAL_CREDIT"),
        
        INVOICE_SALES_INCENTIVE_CREDIT("INVOICE_SALES_INCENTIVE_CREDIT"),
        
        INVOICE_SALES_INCENTIVE_CREDIT_APPLIED("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED"),
        
        PREPAID_CREDIT_REFUND("PREPAID_CREDIT_REFUND"),
        
        NULL("null")
    
        private final String value
    
        DiscountTypeEnum(String value) {
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

    /* The type of discount of this credit */
    DiscountTypeEnum discountType
    /* The discount applied in the offer’s currency value. */
    BigDecimal discountInMicroCurrency
    /* Currency value for the discount. */
    String discountCurrency
    /* Human readable title of the offer code. */
    String title
    /* The credits left to spend. */
    BigDecimal remainingDiscountInMicroCurrency
}
