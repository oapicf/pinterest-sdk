# BrandAccountUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**About** | **String** | Brand Account about information | [optional] 
**Country** | [**Country**](Country.md) |  | [optional] 
**Name** | **String** | Brand Account name | [optional] 
**ProfileImage** | [**BrandAccountProfileImageUpdate**](BrandAccountProfileImageUpdate.md) |  | [optional] 
**Username** | **String** | Brand Account username | [optional] 
**Website** | **String** | Brand Account website | [optional] 

## Examples

- Prepare the resource
```powershell
$BrandAccountUpdate = Initialize-PSOpenAPIToolsBrandAccountUpdate  -About null `
 -Country null `
 -Name null `
 -ProfileImage null `
 -Username null `
 -Website null
```

- Convert the resource to JSON
```powershell
$BrandAccountUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

