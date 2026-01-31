package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;

@Canonical
class BillingInvoiceResponse {
    /* The ID of the ad account this invoice belongs to */
    String adAccountId
    /* The name of the ad account this invoice belongs to */
    String adAccountName
    /* The amount billed in this invoice. Denoted in micro currency */
    Integer amountBilledMicroCurrency
    /* The discount in this invoice. Denoted in micro currency */
    Integer amountDiscountMicroCurrency
    /* The net amount in this invoice. Denoted in micro currency */
    Integer amountNetMicroCurrency
    /* The tax in this invoice. Denoted in micro currency */
    Integer amountTaxMicroCurrency
    /* The country of the bill to address */
    String billToCountry
    /* The end date of the billing period. Format: YYYY-MM-DD */
    Date billingPeriodEndDate
    /* The start date of the billing period. Format: YYYY-MM-DD */
    Date billingPeriodStartDate
    
    Currency currency

    enum DocumentTypeEnum {
    
        INVOICE("INVOICE"),
        
        CREDIT_MEMO("CREDIT_MEMO")
    
        private final String value
    
        DocumentTypeEnum(String value) {
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

    /* The type of the document */
    DocumentTypeEnum documentType
    /* Unique identifier for the billing invoice */
    String id
    /* The date the invoice is due. Format: YYYY-MM-DD */
    Date invoiceDueDate
    /* The payment terms of the invoice */
    String paymentTerms

    enum StatusEnum {
    
        OPEN("OPEN"),
        
        CLOSED("CLOSED")
    
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

    /* The status of the invoice */
    StatusEnum status
}
