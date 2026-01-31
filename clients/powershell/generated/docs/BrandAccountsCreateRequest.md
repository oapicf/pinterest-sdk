# BrandAccountsCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Brand Account name | 
**Username** | **String** | Brand Account username | 
**Country** | [**Country**](Country.md) |  | 
**About** | **String** | Brand Account about information | [optional] 
**Website** | **String** | Brand Account website | [optional] 
**ProfileImage** | [**ImageBase64**](ImageBase64.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BrandAccountsCreateRequest = Initialize-PSOpenAPIToolsBrandAccountsCreateRequest  -Name Canada Stores `
 -Username canada_stores `
 -Country null `
 -About Stores in Canada `
 -Website https://www.example.com `
 -ProfileImage null
```

- Convert the resource to JSON
```powershell
$BrandAccountsCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

