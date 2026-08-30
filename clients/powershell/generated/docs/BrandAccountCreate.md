# BrandAccountCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**About** | **String** | Brand Account about information | [optional] 
**Country** | [**Country**](Country.md) |  | 
**Name** | **String** | Brand Account name | 
**ProfileImage** | [**BrandAccountProfileImage**](BrandAccountProfileImage.md) |  | [optional] 
**Username** | **String** | Brand Account username | 
**Website** | **String** | Brand Account website | [optional] 

## Examples

- Prepare the resource
```powershell
$BrandAccountCreate = Initialize-PSOpenAPIToolsBrandAccountCreate  -About null `
 -Country null `
 -Name null `
 -ProfileImage null `
 -Username null `
 -Website null
```

- Convert the resource to JSON
```powershell
$BrandAccountCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

