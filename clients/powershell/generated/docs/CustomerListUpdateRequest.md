# CustomerListUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Records** | **String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**OperationType** | [**UserListOperationType**](UserListOperationType.md) |  | 
**Exceptions** | [**Exception**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CustomerListUpdateRequest = Initialize-PSOpenAPIToolsCustomerListUpdateRequest  -Records email2@pinterest.com,email6@pinterest.com, `
 -OperationType null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$CustomerListUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

