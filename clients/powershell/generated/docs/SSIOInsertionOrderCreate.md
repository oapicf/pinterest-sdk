# SSIOInsertionOrderCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptedTermsId** | **String** | The SFDC id for the terms | 
**AcceptedTermsTime** | **Int32** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**AgencyLink** | **String** | URL link for agency | [optional] 
**BillingContactEmail** | **String** | The billing contact email | 
**BillingContactFirstname** | **String** | The billing contact first name | 
**BillingContactLastname** | **String** | The billing contact last name | 
**BilltoBillingAddressId** | **String** | The bill-to billing address id | 
**BilltoBusinessAddressId** | **String** | The bill-to business address id | 
**BilltoCompanyId** | **String** | The bill-to company id | 
**BudgetAmount** | **Double** | If Budget order line, the budget amount. | [optional] 
**CurrencyInfo** | [**Currency**](Currency.md) |  | 
**EndDate** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] 
**EstimatedMonthlySpend** | **Double** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**MediaContactEmail** | **String** | The media contact email | 
**MediaContactFirstname** | **String** | The media contact first name | 
**MediaContactLastname** | **String** | The media contact last name | 
**OrderLineType** | [**SSIOOrderLineType**](SSIOOrderLineType.md) | Type can be Budget or Perpetual | 
**OrderName** | **String** | The order name | 
**PmpId** | **String** | The pmp id | 
**PoNumber** | **String** | The po number | 
**StartDate** | **String** | Starting date of time period. Format: YYYY-MM-DD | 
**UserEmail** | **String** | The email of user submitting the insertion order | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOInsertionOrderCreate = Initialize-PSOpenAPIToolsSSIOInsertionOrderCreate  -AcceptedTermsId null `
 -AcceptedTermsTime null `
 -AgencyLink null `
 -BillingContactEmail null `
 -BillingContactFirstname null `
 -BillingContactLastname null `
 -BilltoBillingAddressId null `
 -BilltoBusinessAddressId null `
 -BilltoCompanyId null `
 -BudgetAmount null `
 -CurrencyInfo null `
 -EndDate null `
 -EstimatedMonthlySpend null `
 -MediaContactEmail null `
 -MediaContactFirstname null `
 -MediaContactLastname null `
 -OrderLineType null `
 -OrderName null `
 -PmpId null `
 -PoNumber null `
 -StartDate null `
 -UserEmail null
```

- Convert the resource to JSON
```powershell
$SSIOInsertionOrderCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

