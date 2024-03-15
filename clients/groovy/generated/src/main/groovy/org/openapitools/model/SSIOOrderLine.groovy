package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;

@Canonical
class SSIOOrderLine {
    /* OrderLineId in SFDC */
    String salesforceOrderLineId
    /* Ads manager OrderLineId */
    String adsManagerOrderLineId
    /* The pin order id associated with the order line in SFDC */
    String pinOrderId
    /* Last modified date. */
    String lastModifiedDateTime
    /* Start date of the order line. */
    Date startDate
    /* End date of the order line. */
    Date endDate
    /* Bill To Company name */
    String billToCompanyName
    /* Billing contact first name */
    String billingContactFirstname
    /* Billing contact last name */
    String billingContactLastname
    /* Billing contact email */
    String billingContactEmail
    /* Billing media email */
    String mediaContactEmail
    /* Billing contact first name */
    String mediaContactFirstname
    /* Billing contact first name */
    String mediaContactLastname
    
    Currency currencyInfo
    /* Agency link */
    String agencyLink
    /* The po number */
    String poNumber
    /* The order name */
    String orderName
    /* The Pinterest marketing partner name */
    String pmpName
    /* The SFDC id for the terms */
    String acceptedTermsId
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    String acceptedTermsTime
    /* If Budget order line, the budget amount. */
    BigDecimal budgetAmount
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    BigDecimal estimatedMonthlySpend
}
