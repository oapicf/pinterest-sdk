package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BillingProfilesResponse {
    /* Billing ID. */
    String id

    enum CardTypeEnum {
    
        UNKNOWN("UNKNOWN"),
        
        VISA("VISA"),
        
        MASTERCARD("MASTERCARD"),
        
        AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
        
        DISCOVER("DISCOVER"),
        
        ELO("ELO")
    
        private final String value
    
        CardTypeEnum(String value) {
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

    /* Type of the card. */
    CardTypeEnum cardType

    enum StatusEnum {
    
        UNSPECIFIED("UNSPECIFIED"),
        
        VALID("VALID"),
        
        INVALID("INVALID"),
        
        PENDING("PENDING"),
        
        DELETED("DELETED"),
        
        SECONDARY("SECONDARY"),
        
        PENDING_SECONDARY("PENDING_SECONDARY")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* Status of the billing. */
    StatusEnum status
    /* Advertiser ID of the billing. */
    String advertiserId

    enum PaymentMethodBrandEnum {
    
        UNKNOWN("UNKNOWN"),
        
        VISA("VISA"),
        
        MASTERCARD("MASTERCARD"),
        
        AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
        
        DISCOVER("DISCOVER"),
        
        SOFORT("SOFORT"),
        
        DINERS_CLUB("DINERS_CLUB"),
        
        ELO("ELO"),
        
        CARTE_BANCAIRE("CARTE_BANCAIRE")
    
        private final String value
    
        PaymentMethodBrandEnum(String value) {
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

    /* Brand of the payment method. */
    PaymentMethodBrandEnum paymentMethodBrand
}
