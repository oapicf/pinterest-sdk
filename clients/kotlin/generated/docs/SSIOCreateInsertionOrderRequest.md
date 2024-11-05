
# SSIOCreateInsertionOrderRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | **kotlin.String** | Starting date of time period. Format: YYYY-MM-DD |  |
| **poNumber** | **kotlin.String** | The po number |  |
| **billingContactFirstname** | **kotlin.String** | The billing contact first name |  |
| **billingContactLastname** | **kotlin.String** | The billing contact last name |  |
| **billingContactEmail** | **kotlin.String** | The billing contact email |  |
| **mediaContactFirstname** | **kotlin.String** | The media contact first name |  |
| **mediaContactLastname** | **kotlin.String** | The media contact last name |  |
| **mediaContactEmail** | **kotlin.String** | The media contact email |  |
| **pmpId** | **kotlin.String** | The pmp id |  |
| **orderName** | **kotlin.String** | The order name |  |
| **orderLineType** | [**inline**](#OrderLineType) | Type can be Budget or Perpetual |  |
| **acceptedTermsId** | **kotlin.String** | The SFDC id for the terms |  |
| **billtoCompanyId** | **kotlin.String** | The bill-to company id |  |
| **billtoBusinessAddressId** | **kotlin.String** | The bill-to business address id |  |
| **billtoBillingAddressId** | **kotlin.String** | The bill-to billing address id |  |
| **currencyInfo** | [**Currency**](Currency.md) |  |  |
| **endDate** | **kotlin.String** | End date of time period. Format: YYYY-MM-DD |  [optional] |
| **budgetAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | If Budget order line, the budget amount. |  [optional] |
| **agencyLink** | **kotlin.String** | URL link for agency |  [optional] |
| **userEmail** | **kotlin.String** | The email of user submitting the insertion order |  [optional] |
| **acceptedTermsTime** | **kotlin.Int** | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional] |
| **estimatedMonthlySpend** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional] |


<a id="OrderLineType"></a>
## Enum: order_line_type
| Name | Value |
| ---- | ----- |
| orderLineType | BUDGET, PERPETUALS |



