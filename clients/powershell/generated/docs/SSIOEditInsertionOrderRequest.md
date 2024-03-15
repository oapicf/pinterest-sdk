# SSIOEditInsertionOrderRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **String** | Starting date of time period. Format: YYYY-MM-DD | [optional] 
**EndDate** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] 
**PoNumber** | **String** | The po number | [optional] 
**BudgetAmount** | **Decimal** | If Budget order line, the budget amount. | [optional] 
**BillingContactFirstname** | **String** | The billing contact first name | [optional] 
**BillingContactLastname** | **String** | The billing contact last name | [optional] 
**BillingContactEmail** | **String** | The billing contact email | [optional] 
**MediaContactFirstname** | **String** | The media contact first name | [optional] 
**MediaContactLastname** | **String** | The media contact last name | [optional] 
**MediaContactEmail** | **String** | The media contact email | [optional] 
**AgencyLink** | **String** | URL link for agency | [optional] 
**UserEmail** | **String** | The email of user submitting the insertion order | [optional] 
**OracleLineId** | **String** | LineId in the Oracle DB | [optional] 
**SalesforceOrderId** | **String** | OrderId in SFDC | [optional] 
**SalesforceOrderLineId** | **String** | OrderLineId in SFDC | [optional] 
**AdsManagerOrderLineId** | **String** | Ads manager OrderLineId | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOEditInsertionOrderRequest = Initialize-PSOpenAPIToolsSSIOEditInsertionOrderRequest  -StartDate 2020-12-20 `
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
 -OracleLineId null `
 -SalesforceOrderId null `
 -SalesforceOrderLineId null `
 -AdsManagerOrderLineId null
```

- Convert the resource to JSON
```powershell
$SSIOEditInsertionOrderRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

