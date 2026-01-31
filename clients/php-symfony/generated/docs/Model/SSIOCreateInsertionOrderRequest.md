# SSIOCreateInsertionOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agencyLink** | **string** | URL link for agency | [optional] 
**billingContactEmail** | **string** | The billing contact email | 
**billingContactFirstname** | **string** | The billing contact first name | 
**billingContactLastname** | **string** | The billing contact last name | 
**budgetAmount** | **float** | If Budget order line, the budget amount. | [optional] 
**endDate** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**mediaContactEmail** | **string** | The media contact email | 
**mediaContactFirstname** | **string** | The media contact first name | 
**mediaContactLastname** | **string** | The media contact last name | 
**poNumber** | **string** | The po number | 
**startDate** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**userEmail** | **string** | The email of user submitting the insertion order | [optional] 
**acceptedTermsId** | **string** | The SFDC id for the terms | 
**acceptedTermsTime** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**billtoBillingAddressId** | **string** | The bill-to billing address id | 
**billtoBusinessAddressId** | **string** | The bill-to business address id | 
**billtoCompanyId** | **string** | The bill-to company id | 
**currencyInfo** | [**OpenAPI\Server\Model\Currency**](Currency.md) |  | 
**estimatedMonthlySpend** | **float** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**orderLineType** | **string** | Type can be Budget or Perpetual | 
**orderName** | **string** | The order name | 
**pmpId** | **string** | The pmp id | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


