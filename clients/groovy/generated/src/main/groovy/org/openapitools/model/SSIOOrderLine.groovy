package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;

@Canonical
class SSIOOrderLine {
    /* The SFDC id for the terms */
    String acceptedTermsId
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    String acceptedTermsTime
    /* Ads manager OrderLineId */
    String adsManagerOrderLineId
    /* Agency link */
    String agencyLink
    /* Bill To Company name */
    String billToCompanyName
    /* Billing contact email */
    String billingContactEmail
    /* Billing contact first name */
    String billingContactFirstname
    /* Billing contact last name */
    String billingContactLastname
    /* If Budget order line, the budget amount. */
    BigDecimal budgetAmount
    
    Currency currencyInfo
    /* End date of the order line. */
    Date endDate
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    BigDecimal estimatedMonthlySpend
    /* Last modified date. */
    String lastModifiedDateTime
    /* Billing media email */
    String mediaContactEmail
    /* Billing contact first name */
    String mediaContactFirstname
    /* Billing contact first name */
    String mediaContactLastname
    /* The order name */
    String orderName
    /* The pin order id associated with the order line in SFDC */
    String pinOrderId
    /* The Pinterest marketing partner name */
    String pmpName
    /* The po number */
    String poNumber
    /* OrderLineId in SFDC */
    String salesforceOrderLineId
    /* Start date of the order line. */
    Date startDate
}
