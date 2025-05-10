# Org.OpenAPITools.Model.SSIOCreateInsertionOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**PoNumber** | **string** | The po number | 
**BillingContactFirstname** | **string** | The billing contact first name | 
**BillingContactLastname** | **string** | The billing contact last name | 
**BillingContactEmail** | **string** | The billing contact email | 
**MediaContactFirstname** | **string** | The media contact first name | 
**MediaContactLastname** | **string** | The media contact last name | 
**MediaContactEmail** | **string** | The media contact email | 
**PmpId** | **string** | The pmp id | 
**OrderName** | **string** | The order name | 
**OrderLineType** | **string** | Type can be Budget or Perpetual | 
**AcceptedTermsId** | **string** | The SFDC id for the terms | 
**BilltoCompanyId** | **string** | The bill-to company id | 
**BilltoBusinessAddressId** | **string** | The bill-to business address id | 
**BilltoBillingAddressId** | **string** | The bill-to billing address id | 
**CurrencyInfo** | **Currency** |  | 
**EndDate** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**BudgetAmount** | **decimal** | If Budget order line, the budget amount. | [optional] 
**AgencyLink** | **string** | URL link for agency | [optional] 
**UserEmail** | **string** | The email of user submitting the insertion order | [optional] 
**AcceptedTermsTime** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**EstimatedMonthlySpend** | **decimal** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

