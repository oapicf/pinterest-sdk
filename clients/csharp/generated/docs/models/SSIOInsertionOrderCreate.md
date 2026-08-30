# Org.OpenAPITools.Model.SSIOInsertionOrderCreate
Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptedTermsId** | **string** | The SFDC id for the terms | 
**BillingContactEmail** | **string** | The billing contact email | 
**BillingContactFirstname** | **string** | The billing contact first name | 
**BillingContactLastname** | **string** | The billing contact last name | 
**BilltoBillingAddressId** | **string** | The bill-to billing address id | 
**BilltoBusinessAddressId** | **string** | The bill-to business address id | 
**BilltoCompanyId** | **string** | The bill-to company id | 
**CurrencyInfo** | **Currency** |  | 
**MediaContactEmail** | **string** | The media contact email | 
**MediaContactFirstname** | **string** | The media contact first name | 
**MediaContactLastname** | **string** | The media contact last name | 
**OrderLineType** | **SSIOOrderLineType** | Type can be Budget or Perpetual | 
**OrderName** | **string** | The order name | 
**PmpId** | **string** | The pmp id | 
**PoNumber** | **string** | The po number | 
**StartDate** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**AcceptedTermsTime** | **int** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**AgencyLink** | **string** | URL link for agency | [optional] 
**BudgetAmount** | **double** | If Budget order line, the budget amount. | [optional] 
**EndDate** | **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**EstimatedMonthlySpend** | **double** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**UserEmail** | **string** | The email of user submitting the insertion order | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

