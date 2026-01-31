# AdAccountsSubscriptionsGetList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**LeadSubscription[]**](LeadSubscription.md) |  | 

## Examples

- Prepare the resource
```powershell
$AdAccountsSubscriptionsGetList200Response = Initialize-PSOpenAPIToolsAdAccountsSubscriptionsGetList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$AdAccountsSubscriptionsGetList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

