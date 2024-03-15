# OAISSIOCreateInsertionOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **NSString*** | Starting date of time period. Format: YYYY-MM-DD | 
**endDate** | **NSString*** | End date of time period. Format: YYYY-MM-DD | [optional] 
**poNumber** | **NSString*** | The po number | 
**budgetAmount** | **NSNumber*** | If Budget order line, the budget amount. | [optional] 
**billingContactFirstname** | **NSString*** | The billing contact first name | 
**billingContactLastname** | **NSString*** | The billing contact last name | 
**billingContactEmail** | **NSString*** | The billing contact email | 
**mediaContactFirstname** | **NSString*** | The media contact first name | 
**mediaContactLastname** | **NSString*** | The media contact last name | 
**mediaContactEmail** | **NSString*** | The media contact email | 
**agencyLink** | **NSString*** | URL link for agency | [optional] 
**userEmail** | **NSString*** | The email of user submitting the insertion order | [optional] 
**acceptedTermsTime** | **NSNumber*** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**pmpId** | **NSString*** | The pmp id | 
**orderName** | **NSString*** | The order name | 
**orderLineType** | **NSString*** | Type can be Budget or Perpetual | 
**acceptedTermsId** | **NSString*** | The SFDC id for the terms | 
**billtoCompanyId** | **NSString*** | The bill-to company id | 
**billtoBusinessAddressId** | **NSString*** | The bill-to business address id | 
**billtoBillingAddressId** | **NSString*** | The bill-to billing address id | 
**estimatedMonthlySpend** | **NSNumber*** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**currencyInfo** | [**OAICurrency***](OAICurrency.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


