package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Currency;

@Canonical
class SSIOCreateInsertionOrderRequest {
    /* Starting date of time period. Format: YYYY-MM-DD */
    String startDate
    /* End date of time period. Format: YYYY-MM-DD */
    String endDate
    /* The po number */
    String poNumber
    /* If Budget order line, the budget amount. */
    BigDecimal budgetAmount
    /* The billing contact first name */
    String billingContactFirstname
    /* The billing contact last name */
    String billingContactLastname
    /* The billing contact email */
    String billingContactEmail
    /* The media contact first name */
    String mediaContactFirstname
    /* The media contact last name */
    String mediaContactLastname
    /* The media contact email */
    String mediaContactEmail
    /* URL link for agency */
    String agencyLink
    /* The email of user submitting the insertion order */
    String userEmail
    /* The UTC timestamp (to the nearest sec) of when terms were accepted */
    Integer acceptedTermsTime
    /* The pmp id */
    String pmpId
    /* The order name */
    String orderName

    enum OrderLineTypeEnum {
    
        BUDGET("BUDGET"),
        
        PERPETUALS("PERPETUALS")
    
        private final String value
    
        OrderLineTypeEnum(String value) {
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

    /* Type can be Budget or Perpetual */
    OrderLineTypeEnum orderLineType
    /* The SFDC id for the terms */
    String acceptedTermsId
    /* The bill-to company id */
    String billtoCompanyId
    /* The bill-to business address id */
    String billtoBusinessAddressId
    /* The bill-to billing address id */
    String billtoBillingAddressId
    /* If Ongoing (perpetual) order line, the estimated monthly spend */
    BigDecimal estimatedMonthlySpend
    
    Currency currencyInfo
}
