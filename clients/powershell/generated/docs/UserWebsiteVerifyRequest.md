# UserWebsiteVerifyRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Website** | **String** |  | [optional] 
**VerificationMethod** | **String** |  | [optional] [default to "METATAG"]

## Examples

- Prepare the resource
```powershell
$UserWebsiteVerifyRequest = Initialize-PSOpenAPIToolsUserWebsiteVerifyRequest  -Website pintest-website-12345678.test/test_1 `
 -VerificationMethod null
```

- Convert the resource to JSON
```powershell
$UserWebsiteVerifyRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

