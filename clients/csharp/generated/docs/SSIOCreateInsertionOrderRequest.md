# Org.OpenAPITools.Model.SSIOCreateInsertionOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**EndDate** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**PoNumber** | **string** | The po number | 
**BudgetAmount** | **decimal** | If Budget order line, the budget amount. | [optional] 
**BillingContactFirstname** | **string** | The billing contact first name | 
**BillingContactLastname** | **string** | The billing contact last name | 
**BillingContactEmail** | **string** | The billing contact email | 
**MediaContactFirstname** | **string** | The media contact first name | 
**MediaContactLastname** | **string** | The media contact last name | 
**MediaContactEmail** | **string** | The media contact email | 
**AgencyLink** | **string** | URL link for agency | [optional] 
**UserEmail** | **string** | The email of user submitting the insertion order | [optional] 
**AcceptedTermsTime** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**PmpId** | **string** | The pmp id | 
**OrderName** | **string** | The order name | 
**OrderLineType** | **string** | Type can be Budget or Perpetual | 
**AcceptedTermsId** | **string** | The SFDC id for the terms | 
**BilltoCompanyId** | **string** | The bill-to company id | 
**BilltoBusinessAddressId** | **string** | The bill-to business address id | 
**BilltoBillingAddressId** | **string** | The bill-to billing address id | 
**EstimatedMonthlySpend** | **decimal** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**CurrencyInfo** | **Currency** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

