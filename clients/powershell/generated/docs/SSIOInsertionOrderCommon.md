# SSIOInsertionOrderCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgencyLink** | **String** | URL link for agency | [optional] 
**BillingContactEmail** | **String** | The billing contact email | [optional] 
**BillingContactFirstname** | **String** | The billing contact first name | [optional] 
**BillingContactLastname** | **String** | The billing contact last name | [optional] 
**BudgetAmount** | **Decimal** | If Budget order line, the budget amount. | [optional] 
**EndDate** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] 
**MediaContactEmail** | **String** | The media contact email | [optional] 
**MediaContactFirstname** | **String** | The media contact first name | [optional] 
**MediaContactLastname** | **String** | The media contact last name | [optional] 
**PoNumber** | **String** | The po number | [optional] 
**StartDate** | **String** | Starting date of time period. Format: YYYY-MM-DD | [optional] 
**UserEmail** | **String** | The email of user submitting the insertion order | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOInsertionOrderCommon = Initialize-PSOpenAPIToolsSSIOInsertionOrderCommon  -AgencyLink null `
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
 -UserEmail test@example
```

- Convert the resource to JSON
```powershell
$SSIOInsertionOrderCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

