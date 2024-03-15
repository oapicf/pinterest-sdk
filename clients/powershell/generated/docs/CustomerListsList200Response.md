# CustomerListsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**CustomerList[]**](CustomerList.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CustomerListsList200Response = Initialize-PSOpenAPIToolsCustomerListsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$CustomerListsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

