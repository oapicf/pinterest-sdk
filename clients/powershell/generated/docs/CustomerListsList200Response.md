# CustomerListsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**CustomerList[]**](CustomerList.md) |  | 

## Examples

- Prepare the resource
```powershell
$CustomerListsList200Response = Initialize-PSOpenAPIToolsCustomerListsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CustomerListsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

