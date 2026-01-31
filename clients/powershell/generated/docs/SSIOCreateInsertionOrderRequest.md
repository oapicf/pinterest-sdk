# SSIOCreateInsertionOrderRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgencyLink** | **String** | URL link for agency | [optional] 
**BillingContactEmail** | **String** | The billing contact email | 
**BillingContactFirstname** | **String** | The billing contact first name | 
**BillingContactLastname** | **String** | The billing contact last name | 
**BudgetAmount** | **Decimal** | If Budget order line, the budget amount. | [optional] 
**EndDate** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] 
**MediaContactEmail** | **String** | The media contact email | 
**MediaContactFirstname** | **String** | The media contact first name | 
**MediaContactLastname** | **String** | The media contact last name | 
**PoNumber** | **String** | The po number | 
**StartDate** | **String** | Starting date of time period. Format: YYYY-MM-DD | 
**UserEmail** | **String** | The email of user submitting the insertion order | [optional] 
**AcceptedTermsId** | **String** | The SFDC id for the terms | 
**AcceptedTermsTime** | **Int32** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**BilltoBillingAddressId** | **String** | The bill-to billing address id | 
**BilltoBusinessAddressId** | **String** | The bill-to business address id | 
**BilltoCompanyId** | **String** | The bill-to company id | 
**CurrencyInfo** | [**Currency**](Currency.md) |  | 
**EstimatedMonthlySpend** | **Decimal** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**OrderLineType** | **String** | Type can be Budget or Perpetual | 
**OrderName** | **String** | The order name | 
**PmpId** | **String** | The pmp id | 

## Examples

- Prepare the resource
```powershell
$SSIOCreateInsertionOrderRequest = Initialize-PSOpenAPIToolsSSIOCreateInsertionOrderRequest  -AgencyLink null `
 -BillingContactEmail test@example `
 -BillingContactFirstname null `
 -BillingContactLastname null `
 -BudgetAmount 5000000 `
 -EndDate 2020-12-20 `
 -MediaContactEmail test@example `
 -MediaContactFirstname null `
 -MediaContactLastname null `
 -PoNumber null `
 -StartDate 2020-12-20 `
 -UserEmail test@example `
 -AcceptedTermsId null `
 -AcceptedTermsTime null `
 -BilltoBillingAddressId null `
 -BilltoBusinessAddressId null `
 -BilltoCompanyId null `
 -CurrencyInfo null `
 -EstimatedMonthlySpend null `
 -OrderLineType null `
 -OrderName null `
 -PmpId null
```

- Convert the resource to JSON
```powershell
$SSIOCreateInsertionOrderRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

