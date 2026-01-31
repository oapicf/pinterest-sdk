# UserWebsiteSummary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **String** | Status of the verification process | [optional] 
**VerifiedAt** | **String** | UTC timestamp when the verification happened - sometimes missing | [optional] 
**Website** | **String** | Website with path or domain only | [optional] 

## Examples

- Prepare the resource
```powershell
$UserWebsiteSummary = Initialize-PSOpenAPIToolsUserWebsiteSummary  -Status success `
 -VerifiedAt 2022-12-14T21:03:01.602000 `
 -Website mysite.test
```

- Convert the resource to JSON
```powershell
$UserWebsiteSummary | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

