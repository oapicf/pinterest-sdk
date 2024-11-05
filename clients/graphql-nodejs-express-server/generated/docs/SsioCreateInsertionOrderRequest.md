# SsioCreateInsertionOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String!** | Starting date of time period. Format: YYYY-MM-DD | [default to null]
**endDate** | **String!** | End date of time period. Format: YYYY-MM-DD | [optional] [default to null]
**poNumber** | **String!** | The po number | [default to null]
**budgetAmount** | **Float!** | If Budget order line, the budget amount. | [optional] [default to null]
**billingContactFirstname** | **String!** | The billing contact first name | [default to null]
**billingContactLastname** | **String!** | The billing contact last name | [default to null]
**billingContactEmail** | **String!** | The billing contact email | [default to null]
**mediaContactFirstname** | **String!** | The media contact first name | [default to null]
**mediaContactLastname** | **String!** | The media contact last name | [default to null]
**mediaContactEmail** | **String!** | The media contact email | [default to null]
**agencyLink** | **String!** | URL link for agency | [optional] [default to null]
**userEmail** | **String!** | The email of user submitting the insertion order | [optional] [default to null]
**acceptedTermsTime** | **Int!** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] [default to null]
**pmpId** | **String!** | The pmp id | [default to null]
**orderName** | **String!** | The order name | [default to null]
**orderLineType** | **String!** | Type can be Budget or Perpetual | [default to null]
**acceptedTermsId** | **String!** | The SFDC id for the terms | [default to null]
**billtoCompanyId** | **String!** | The bill-to company id | [default to null]
**billtoBusinessAddressId** | **String!** | The bill-to business address id | [default to null]
**billtoBillingAddressId** | **String!** | The bill-to billing address id | [default to null]
**estimatedMonthlySpend** | **Float!** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] [default to null]
**currencyInfo** | [***Currency**](Currency.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


