# UserWebsiteVerificationCode
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VerificationCode** | **String** | Code to check against the user claiming the website | [optional] 
**DnsTxtRecord** | **String** | DNS TXT record to check against for the website to be claimed | [optional] 
**Metatag** | **String** | Metatag the verification process searchs for the website to be claimed | [optional] 
**Filename** | **String** | File expected to find on the website being claimed | [optional] 
**FileContent** | **String** | A full html file to upload to the website in order for it to be claimed | [optional] 

## Examples

- Prepare the resource
```powershell
$UserWebsiteVerificationCode = Initialize-PSOpenAPIToolsUserWebsiteVerificationCode  -VerificationCode e1edcc1a43976c646367e9c6c9a9b7b6 `
 -DnsTxtRecord pinterest-site-verification&#x3D;e1edcc1a43976c646367e9c6c9a9b7b6 `
 -Metatag &lt;meta name&#x3D;&quot;p:domain_verify&quot; content&#x3D;&quot;e1edcc1a43976c646367e9c6c9a9b7b6&quot;/&gt; `
 -Filename pinterest-e1edc.html `
 -FileContent null
```

- Convert the resource to JSON
```powershell
$UserWebsiteVerificationCode | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

