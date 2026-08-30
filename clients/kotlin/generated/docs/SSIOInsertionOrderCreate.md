
# SSIOInsertionOrderCreate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **acceptedTermsId** | **kotlin.String** | The SFDC id for the terms |  |
| **billingContactEmail** | **kotlin.String** | The billing contact email |  |
| **billingContactFirstname** | **kotlin.String** | The billing contact first name |  |
| **billingContactLastname** | **kotlin.String** | The billing contact last name |  |
| **billtoBillingAddressId** | **kotlin.String** | The bill-to billing address id |  |
| **billtoBusinessAddressId** | **kotlin.String** | The bill-to business address id |  |
| **billtoCompanyId** | **kotlin.String** | The bill-to company id |  |
| **currencyInfo** | [**Currency**](Currency.md) |  |  |
| **mediaContactEmail** | **kotlin.String** | The media contact email |  |
| **mediaContactFirstname** | **kotlin.String** | The media contact first name |  |
| **mediaContactLastname** | **kotlin.String** | The media contact last name |  |
| **orderLineType** | [**SSIOOrderLineType**](SSIOOrderLineType.md) | Type can be Budget or Perpetual |  |
| **orderName** | **kotlin.String** | The order name |  |
| **pmpId** | **kotlin.String** | The pmp id |  |
| **poNumber** | **kotlin.String** | The po number |  |
| **startDate** | **kotlin.String** | Starting date of time period. Format: YYYY-MM-DD |  |
| **acceptedTermsTime** | **kotlin.Int** | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional] |
| **agencyLink** | **kotlin.String** | URL link for agency |  [optional] |
| **budgetAmount** | **kotlin.Double** | If Budget order line, the budget amount. |  [optional] |
| **endDate** | **kotlin.String** | End date of time period. Format: YYYY-MM-DD |  [optional] |
| **estimatedMonthlySpend** | **kotlin.Double** | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional] |
| **userEmail** | **kotlin.String** | The email of user submitting the insertion order |  [optional] |



