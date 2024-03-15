# AdAccountsSubscriptionsGetList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**AdAccountGetSubscriptionResponse[]**](AdAccountGetSubscriptionResponse.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountsSubscriptionsGetList200Response = Initialize-PSOpenAPIToolsAdAccountsSubscriptionsGetList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$AdAccountsSubscriptionsGetList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

