# UserWebsiteVerifyRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VerificationMethod** | **String** |  | [optional] [default to "METATAG"]
**Website** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UserWebsiteVerifyRequest = Initialize-PSOpenAPIToolsUserWebsiteVerifyRequest  -VerificationMethod null `
 -Website pintest-website-12345678.test/test_1
```

- Convert the resource to JSON
```powershell
$UserWebsiteVerifyRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

