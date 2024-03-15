# SSIOCreateInsertionOrderRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **String** | Starting date of time period. Format: YYYY-MM-DD | 
**EndDate** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] 
**PoNumber** | **String** | The po number | 
**BudgetAmount** | **Decimal** | If Budget order line, the budget amount. | [optional] 
**BillingContactFirstname** | **String** | The billing contact first name | 
**BillingContactLastname** | **String** | The billing contact last name | 
**BillingContactEmail** | **String** | The billing contact email | 
**MediaContactFirstname** | **String** | The media contact first name | 
**MediaContactLastname** | **String** | The media contact last name | 
**MediaContactEmail** | **String** | The media contact email | 
**AgencyLink** | **String** | URL link for agency | [optional] 
**UserEmail** | **String** | The email of user submitting the insertion order | [optional] 
**AcceptedTermsTime** | **Int32** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**PmpId** | **String** | The pmp id | 
**OrderName** | **String** | The order name | 
**OrderLineType** | **String** | Type can be Budget or Perpetual | 
**AcceptedTermsId** | **String** | The SFDC id for the terms | 
**BilltoCompanyId** | **String** | The bill-to company id | 
**BilltoBusinessAddressId** | **String** | The bill-to business address id | 
**BilltoBillingAddressId** | **String** | The bill-to billing address id | 
**EstimatedMonthlySpend** | **Decimal** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**CurrencyInfo** | [**Currency**](Currency.md) |  | 

## Examples

- Prepare the resource
```powershell
$SSIOCreateInsertionOrderRequest = Initialize-PSOpenAPIToolsSSIOCreateInsertionOrderRequest  -StartDate 2020-12-20 `
 -EndDate 2020-12-20 `
 -PoNumber null `
 -BudgetAmount 5000000 `
 -BillingContactFirstname null `
 -BillingContactLastname null `
 -BillingContactEmail test@example `
 -MediaContactFirstname null `
 -MediaContactLastname null `
 -MediaContactEmail test@example `
 -AgencyLink null `
 -UserEmail test@example `
 -AcceptedTermsTime null `
 -PmpId null `
 -OrderName null `
 -OrderLineType null `
 -AcceptedTermsId null `
 -BilltoCompanyId null `
 -BilltoBusinessAddressId null `
 -BilltoBillingAddressId null `
 -EstimatedMonthlySpend null `
 -CurrencyInfo null
```

- Convert the resource to JSON
```powershell
$SSIOCreateInsertionOrderRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

