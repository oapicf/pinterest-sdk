# ConversionAccessToken
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | **String** |  | 
**TokenType** | **String** |  | [optional] [default to "conversion"]

## Examples

- Prepare the resource
```powershell
$ConversionAccessToken = Initialize-PSOpenAPIToolsConversionAccessToken  -AccessToken null `
 -TokenType null
```

- Convert the resource to JSON
```powershell
$ConversionAccessToken | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

