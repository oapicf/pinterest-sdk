package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Currency;
import org.openapitools.model.SSIOOrderLineType;

@Canonical
class SSIOInsertionOrderCreate {
    /* The SFDC id for the terms */
    String acceptedTermsId
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    Integer acceptedTermsTime
    /* URL link for agency */
    String agencyLink
    /* The billing contact email */
    String billingContactEmail
    /* The billing contact first name */
    String billingContactFirstname
    /* The billing contact last name */
    String billingContactLastname
    /* The bill-to billing address id */
    String billtoBillingAddressId
    /* The bill-to business address id */
    String billtoBusinessAddressId
    /* The bill-to company id */
    String billtoCompanyId
    /* If Budget order line, the budget amount. */
    Double budgetAmount
    
    Currency currencyInfo
    /* End date of time period. Format: YYYY-MM-DD */
    String endDate
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    Double estimatedMonthlySpend
    /* The media contact email */
    String mediaContactEmail
    /* The media contact first name */
    String mediaContactFirstname
    /* The media contact last name */
    String mediaContactLastname
    /* Type can be Budget or Perpetual */
    SSIOOrderLineType orderLineType
    /* The order name */
    String orderName
    /* The pmp id */
    String pmpId
    /* The po number */
    String poNumber
    /* Starting date of time period. Format: YYYY-MM-DD */
    String startDate
    /* The email of user submitting the insertion order */
    String userEmail
}
