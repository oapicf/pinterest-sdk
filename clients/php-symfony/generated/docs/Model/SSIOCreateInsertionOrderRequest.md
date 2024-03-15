# SSIOCreateInsertionOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**endDate** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**poNumber** | **string** | The po number | 
**budgetAmount** | **float** | If Budget order line, the budget amount. | [optional] 
**billingContactFirstname** | **string** | The billing contact first name | 
**billingContactLastname** | **string** | The billing contact last name | 
**billingContactEmail** | **string** | The billing contact email | 
**mediaContactFirstname** | **string** | The media contact first name | 
**mediaContactLastname** | **string** | The media contact last name | 
**mediaContactEmail** | **string** | The media contact email | 
**agencyLink** | **string** | URL link for agency | [optional] 
**userEmail** | **string** | The email of user submitting the insertion order | [optional] 
**acceptedTermsTime** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**pmpId** | **string** | The pmp id | 
**orderName** | **string** | The order name | 
**orderLineType** | **string** | Type can be Budget or Perpetual | 
**acceptedTermsId** | **string** | The SFDC id for the terms | 
**billtoCompanyId** | **string** | The bill-to company id | 
**billtoBusinessAddressId** | **string** | The bill-to business address id | 
**billtoBillingAddressId** | **string** | The bill-to billing address id | 
**estimatedMonthlySpend** | **float** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**currencyInfo** | [**OpenAPI\Server\Model\Currency**](Currency.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


