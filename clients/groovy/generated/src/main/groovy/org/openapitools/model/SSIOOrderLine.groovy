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
    /* The UTC timestamp (to the nearest second) when terms were accepted. */
    String acceptedTermsTime
    /* Ads manager order line id */
    String adsManagerOrderLineId
    /* Agency link */
    String agencyLink
    /* Bill-to company name */
    String billToCompanyName
    /* Billing contact email */
    String billingContactEmail
    /* Billing contact first name */
    String billingContactFirstname
    /* Billing contact last name */
    String billingContactLastname
    /* If budget order line, the budget amount. */
    BigDecimal budgetAmount
    
    Currency currencyInfo
    /* End date of the order line. */
    Date endDate
    /* If ongoing (perpetual) order line, the estimated monthly spend. */
    BigDecimal estimatedMonthlySpend
    /* Last modified date. */
    String lastModifiedDateTime
    /* Billing media email */
    String mediaContactEmail
    /* Billing media contact first name */
    String mediaContactFirstname
    /* Billing media contact last name */
    String mediaContactLastname
    /* The order name */
    String orderName
    /* The pin order id associated with the order line in SFDC */
    String pinOrderId
    /* The Pinterest marketing partner name */
    String pmpName
    /* The PO number */
    String poNumber
    /* Order line id in SFDC */
    String salesforceOrderLineId
    /* Start date of the order line. */
    Date startDate
}
