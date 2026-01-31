# Org.OpenAPITools.Model.SSIOCreateInsertionOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BillingContactEmail** | **string** | The billing contact email | 
**BillingContactFirstname** | **string** | The billing contact first name | 
**BillingContactLastname** | **string** | The billing contact last name | 
**MediaContactEmail** | **string** | The media contact email | 
**MediaContactFirstname** | **string** | The media contact first name | 
**MediaContactLastname** | **string** | The media contact last name | 
**PoNumber** | **string** | The po number | 
**StartDate** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**AcceptedTermsId** | **string** | The SFDC id for the terms | 
**BilltoBillingAddressId** | **string** | The bill-to billing address id | 
**BilltoBusinessAddressId** | **string** | The bill-to business address id | 
**BilltoCompanyId** | **string** | The bill-to company id | 
**CurrencyInfo** | **Currency** |  | 
**OrderLineType** | **string** | Type can be Budget or Perpetual | 
**OrderName** | **string** | The order name | 
**PmpId** | **string** | The pmp id | 
**AgencyLink** | **string** | URL link for agency | [optional] 
**BudgetAmount** | **decimal** | If Budget order line, the budget amount. | [optional] 
**EndDate** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**UserEmail** | **string** | The email of user submitting the insertion order | [optional] 
**AcceptedTermsTime** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**EstimatedMonthlySpend** | **decimal** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

