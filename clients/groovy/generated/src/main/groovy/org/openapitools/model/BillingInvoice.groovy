package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.Currency;

@Canonical
class BillingInvoice {
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
    /* The type of the document */
    BillingInvoiceDocumentType documentType
    /* Unique identifier for the billing invoice */
    String id
    /* The date the invoice is due. Format: YYYY-MM-DD */
    Date invoiceDueDate
    /* The payment terms of the invoice */
    String paymentTerms
    /* The status of the invoice */
    BillingInvoiceStatus status
}
