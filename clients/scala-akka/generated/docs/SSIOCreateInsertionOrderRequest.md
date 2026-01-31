

# SSIOCreateInsertionOrderRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agencyLink** | **String** | URL link for agency |  [optional]
**billingContactEmail** | **String** | The billing contact email | 
**billingContactFirstname** | **String** | The billing contact first name | 
**billingContactLastname** | **String** | The billing contact last name | 
**budgetAmount** | **BigDecimal** | If Budget order line, the budget amount. |  [optional]
**endDate** | **String** | End date of time period. Format: YYYY-MM-DD |  [optional]
**mediaContactEmail** | **String** | The media contact email | 
**mediaContactFirstname** | **String** | The media contact first name | 
**mediaContactLastname** | **String** | The media contact last name | 
**poNumber** | **String** | The po number | 
**startDate** | **String** | Starting date of time period. Format: YYYY-MM-DD | 
**userEmail** | **String** | The email of user submitting the insertion order |  [optional]
**acceptedTermsId** | **String** | The SFDC id for the terms | 
**acceptedTermsTime** | **Int** | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional]
**billtoBillingAddressId** | **String** | The bill-to billing address id | 
**billtoBusinessAddressId** | **String** | The bill-to business address id | 
**billtoCompanyId** | **String** | The bill-to company id | 
**currencyInfo** | **Currency** |  | 
**estimatedMonthlySpend** | **BigDecimal** | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional]
**orderLineType** | [**OrderLineType**](#OrderLineType) | Type can be Budget or Perpetual | 
**orderName** | **String** | The order name | 
**pmpId** | **String** | The pmp id | 


## Enum: OrderLineType
Allowed values: [BUDGET, PERPETUALS]




