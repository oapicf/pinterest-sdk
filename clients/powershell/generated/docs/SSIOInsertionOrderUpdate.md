# SSIOInsertionOrderUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdsManagerOrderLineId** | **String** | Ads manager OrderLineId | [optional] 
**AgencyLink** | **String** | URL link for agency | [optional] 
**BillingContactEmail** | **String** | The billing contact email | [optional] 
**BillingContactFirstname** | **String** | The billing contact first name | [optional] 
**BillingContactLastname** | **String** | The billing contact last name | [optional] 
**BudgetAmount** | **Double** | If Budget order line, the budget amount. | [optional] 
**EndDate** | **String** | End date of time period. Format: YYYY-MM-DD | [optional] 
**MediaContactEmail** | **String** | The media contact email | [optional] 
**MediaContactFirstname** | **String** | The media contact first name | [optional] 
**MediaContactLastname** | **String** | The media contact last name | [optional] 
**OracleLineId** | **String** | LineId in the Oracle DB | [optional] 
**PoNumber** | **String** | The po number | [optional] 
**SalesforceOrderId** | **String** | OrderId in SFDC | [optional] 
**SalesforceOrderLineId** | **String** | OrderLineId in SFDC | [optional] 
**StartDate** | **String** | Starting date of time period. Format: YYYY-MM-DD | [optional] 
**UserEmail** | **String** | The email of user submitting the insertion order | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOInsertionOrderUpdate = Initialize-PSOpenAPIToolsSSIOInsertionOrderUpdate  -AdsManagerOrderLineId null `
 -AgencyLink null `
 -BillingContactEmail null `
 -BillingContactFirstname null `
 -BillingContactLastname null `
 -BudgetAmount null `
 -EndDate null `
 -MediaContactEmail null `
 -MediaContactFirstname null `
 -MediaContactLastname null `
 -OracleLineId null `
 -PoNumber null `
 -SalesforceOrderId null `
 -SalesforceOrderLineId null `
 -StartDate null `
 -UserEmail null
```

- Convert the resource to JSON
```powershell
$SSIOInsertionOrderUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

