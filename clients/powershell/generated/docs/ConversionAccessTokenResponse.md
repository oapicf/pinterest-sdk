# ConversionAccessTokenResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | **String** |  | 
**TokenType** | **String** |  | [optional] [default to "conversion"]

## Examples

- Prepare the resource
```powershell
$ConversionAccessTokenResponse = Initialize-PSOpenAPIToolsConversionAccessTokenResponse  -AccessToken null `
 -TokenType null
```

- Convert the resource to JSON
```powershell
$ConversionAccessTokenResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

