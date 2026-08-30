# UserWebsiteVerification
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DnsTxtRecord** | **String** | DNS TXT record to check against for the website to be claimed | [optional] 
**FileContent** | **String** | A full html file to upload to the website in order for it to be claimed | [optional] 
**Filename** | **String** | File expected to find on the website being claimed | [optional] 
**Metatag** | **String** | Metatag the verification process searchs for the website to be claimed | [optional] 
**VerificationCode** | **String** | Code to check against the user claiming the website | [optional] 

## Examples

- Prepare the resource
```powershell
$UserWebsiteVerification = Initialize-PSOpenAPIToolsUserWebsiteVerification  -DnsTxtRecord null `
 -FileContent null `
 -Filename null `
 -Metatag null `
 -VerificationCode null
```

- Convert the resource to JSON
```powershell
$UserWebsiteVerification | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

