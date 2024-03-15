

# SSIOCreateInsertionOrderRequest

The class is defined in **[SSIOCreateInsertionOrderRequest.java](../../src/main/java/org/openapitools/model/SSIOCreateInsertionOrderRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | `String` | Starting date of time period. Format: YYYY-MM-DD | 
**endDate** | `String` | End date of time period. Format: YYYY-MM-DD |  [optional property]
**poNumber** | `String` | The po number | 
**budgetAmount** | `BigDecimal` | If Budget order line, the budget amount. |  [optional property]
**billingContactFirstname** | `String` | The billing contact first name | 
**billingContactLastname** | `String` | The billing contact last name | 
**billingContactEmail** | `String` | The billing contact email | 
**mediaContactFirstname** | `String` | The media contact first name | 
**mediaContactLastname** | `String` | The media contact last name | 
**mediaContactEmail** | `String` | The media contact email | 
**agencyLink** | `String` | URL link for agency |  [optional property]
**userEmail** | `String` | The email of user submitting the insertion order |  [optional property]
**acceptedTermsTime** | `Integer` | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional property]
**pmpId** | `String` | The pmp id | 
**orderName** | `String` | The order name | 
**orderLineType** | [**OrderLineTypeEnum**](#OrderLineTypeEnum) | Type can be Budget or Perpetual | 
**acceptedTermsId** | `String` | The SFDC id for the terms | 
**billtoCompanyId** | `String` | The bill-to company id | 
**billtoBusinessAddressId** | `String` | The bill-to business address id | 
**billtoBillingAddressId** | `String` | The bill-to billing address id | 
**estimatedMonthlySpend** | `BigDecimal` | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional property]
**currencyInfo** | `Currency` |  | 
















## OrderLineTypeEnum

Name | Value
---- | -----
BUDGET | `"BUDGET"`
PERPETUALS | `"PERPETUALS"`








