

# SSIOCreateInsertionOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **String** | Starting date of time period. Format: YYYY-MM-DD |  |
|**endDate** | **String** | End date of time period. Format: YYYY-MM-DD |  [optional] |
|**poNumber** | **String** | The po number |  |
|**budgetAmount** | **BigDecimal** | If Budget order line, the budget amount. |  [optional] |
|**billingContactFirstname** | **String** | The billing contact first name |  |
|**billingContactLastname** | **String** | The billing contact last name |  |
|**billingContactEmail** | **String** | The billing contact email |  |
|**mediaContactFirstname** | **String** | The media contact first name |  |
|**mediaContactLastname** | **String** | The media contact last name |  |
|**mediaContactEmail** | **String** | The media contact email |  |
|**agencyLink** | **String** | URL link for agency |  [optional] |
|**userEmail** | **String** | The email of user submitting the insertion order |  [optional] |
|**acceptedTermsTime** | **Integer** | The UTC timestamp (to the nearest sec) of when terms were accepted |  [optional] |
|**pmpId** | **String** | The pmp id |  |
|**orderName** | **String** | The order name |  |
|**orderLineType** | [**OrderLineTypeEnum**](#OrderLineTypeEnum) | Type can be Budget or Perpetual |  |
|**acceptedTermsId** | **String** | The SFDC id for the terms |  |
|**billtoCompanyId** | **String** | The bill-to company id |  |
|**billtoBusinessAddressId** | **String** | The bill-to business address id |  |
|**billtoBillingAddressId** | **String** | The bill-to billing address id |  |
|**estimatedMonthlySpend** | **BigDecimal** | If Ongoing (perpetual) order line, the estimated monthly spend |  [optional] |
|**currencyInfo** | **Currency** |  |  |



## Enum: OrderLineTypeEnum

| Name | Value |
|---- | -----|
| BUDGET | &quot;BUDGET&quot; |
| PERPETUALS | &quot;PERPETUALS&quot; |



