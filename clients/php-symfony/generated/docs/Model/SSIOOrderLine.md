# SSIOOrderLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**salesforceOrderLineId** | **string** | OrderLineId in SFDC | [optional] 
**adsManagerOrderLineId** | **string** | Ads manager OrderLineId | [optional] 
**pinOrderId** | **string** | The pin order id associated with the order line in SFDC | [optional] 
**lastModifiedDateTime** | **string** | Last modified date. | [optional] 
**startDate** | [**\DateTime**](Date.md) | Start date of the order line. | [optional] 
**endDate** | [**\DateTime**](Date.md) | End date of the order line. | [optional] 
**billToCompanyName** | **string** | Bill To Company name | [optional] 
**billingContactFirstname** | **string** | Billing contact first name | [optional] 
**billingContactLastname** | **string** | Billing contact last name | [optional] 
**billingContactEmail** | **string** | Billing contact email | [optional] 
**mediaContactEmail** | **string** | Billing media email | [optional] 
**mediaContactFirstname** | **string** | Billing contact first name | [optional] 
**mediaContactLastname** | **string** | Billing contact first name | [optional] 
**currencyInfo** | [**OpenAPI\Server\Model\Currency**](Currency.md) |  | [optional] 
**agencyLink** | **string** | Agency link | [optional] 
**poNumber** | **string** | The po number | [optional] 
**orderName** | **string** | The order name | [optional] 
**pmpName** | **string** | The Pinterest marketing partner name | [optional] 
**acceptedTermsId** | **string** | The SFDC id for the terms | [optional] 
**acceptedTermsTime** | **string** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**budgetAmount** | **float** | If Budget order line, the budget amount. | [optional] 
**estimatedMonthlySpend** | **float** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


