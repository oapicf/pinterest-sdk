# OAISSIOInsertionOrderCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedTermsId** | **NSString*** | The SFDC id for the terms | 
**acceptedTermsTime** | **NSNumber*** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**agencyLink** | **NSString*** | URL link for agency | [optional] 
**billingContactEmail** | **NSString*** | The billing contact email | 
**billingContactFirstname** | **NSString*** | The billing contact first name | 
**billingContactLastname** | **NSString*** | The billing contact last name | 
**billtoBillingAddressId** | **NSString*** | The bill-to billing address id | 
**billtoBusinessAddressId** | **NSString*** | The bill-to business address id | 
**billtoCompanyId** | **NSString*** | The bill-to company id | 
**budgetAmount** | **NSNumber*** | If Budget order line, the budget amount. | [optional] 
**currencyInfo** | [**OAICurrency***](OAICurrency.md) |  | 
**endDate** | **NSString*** | End date of time period. Format: YYYY-MM-DD | [optional] 
**estimatedMonthlySpend** | **NSNumber*** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**mediaContactEmail** | **NSString*** | The media contact email | 
**mediaContactFirstname** | **NSString*** | The media contact first name | 
**mediaContactLastname** | **NSString*** | The media contact last name | 
**orderLineType** | [**OAISSIOOrderLineType***](OAISSIOOrderLineType.md) | Type can be Budget or Perpetual | 
**orderName** | **NSString*** | The order name | 
**pmpId** | **NSString*** | The pmp id | 
**poNumber** | **NSString*** | The po number | 
**startDate** | **NSString*** | Starting date of time period. Format: YYYY-MM-DD | 
**userEmail** | **NSString*** | The email of user submitting the insertion order | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


