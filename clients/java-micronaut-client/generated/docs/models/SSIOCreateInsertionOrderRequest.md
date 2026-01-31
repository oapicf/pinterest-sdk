

# SSIOCreateInsertionOrderRequest

The class is defined in **[SSIOCreateInsertionOrderRequest.java](../../src/main/java/org/openapitools/model/SSIOCreateInsertionOrderRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agencyLink** | `String` | URL link for agency |  [optional property]
**billingContactEmail** | `String` | The billing contact email | 
**billingContactFirstname** | `String` | The billing contact first name | 
**billingContactLastname** | `String` | The billing contact last name | 
**budgetAmount** | `BigDecimal` | If Budget order line, the budget amount. |  [optional property]
**endDate** | `String` | End date of time period. Format: YYYY-MM-DD |  [optional property]
**mediaContactEmail** | `String` | The media contact email | 
**mediaContactFirstname** | `String` | The media contact first name | 
**mediaContactLastname** | `String` | The media contact last name | 
**poNumber** | `String` | The po number | 
**startDate** | `String` | Starting date of time period. Format: YYYY-MM-DD | 
**userEmail** | `String` | The email of user submitting the insertion order |  [optional property]
**acceptedTermsId** | `String` | The SFDC id for the terms | 
**acceptedTermsTime** | `Integer` | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional property]
**billtoBillingAddressId** | `String` | The bill-to billing address id | 
**billtoBusinessAddressId** | `String` | The bill-to business address id | 
**billtoCompanyId** | `String` | The bill-to company id | 
**currencyInfo** | `Currency` |  | 
**estimatedMonthlySpend** | `BigDecimal` | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional property]
**orderLineType** | [**OrderLineTypeEnum**](#OrderLineTypeEnum) | Type can be Budget or Perpetual | 
**orderName** | `String` | The order name | 
**pmpId** | `String` | The pmp id | 




















## OrderLineTypeEnum

Name | Value
---- | -----
BUDGET | `"BUDGET"`
PERPETUALS | `"PERPETUALS"`




