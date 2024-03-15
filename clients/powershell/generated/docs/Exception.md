# Exception
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** | Exception error code. | [optional] 
**Message** | **String** | Exception message. | [optional] 

## Examples

- Prepare the resource
```powershell
$Exception = Initialize-PSOpenAPIToolsException  -Code 2 `
 -Message Advertiser not found.
```

- Convert the resource to JSON
```powershell
$Exception | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

