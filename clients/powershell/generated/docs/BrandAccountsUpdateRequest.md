# BrandAccountsUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Brand Account name | [optional] 
**Username** | **String** | Brand Account username | [optional] 
**Country** | [**Country**](Country.md) |  | [optional] 
**About** | **String** | Brand Account about information | [optional] 
**Website** | **String** | Brand Account website | [optional] 
**ProfileImage** | [**ImageBase64**](ImageBase64.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BrandAccountsUpdateRequest = Initialize-PSOpenAPIToolsBrandAccountsUpdateRequest  -Name Canada Stores `
 -Username canada_stores `
 -Country null `
 -About Stores in Canada `
 -Website https://www.example.com `
 -ProfileImage null
```

- Convert the resource to JSON
```powershell
$BrandAccountsUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

