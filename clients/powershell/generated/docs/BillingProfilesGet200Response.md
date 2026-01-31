# BillingProfilesGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**BillingProfilesResponse[]**](BillingProfilesResponse.md) |  | 

## Examples

- Prepare the resource
```powershell
$BillingProfilesGet200Response = Initialize-PSOpenAPIToolsBillingProfilesGet200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$BillingProfilesGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

