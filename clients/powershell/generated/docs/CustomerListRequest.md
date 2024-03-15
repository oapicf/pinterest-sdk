# CustomerListRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Customer list name. | 
**Records** | **String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**ListType** | [**UserListType**](UserListType.md) |  | [optional] [default to "EMAIL"]
**Exceptions** | [**SystemCollectionsHashtable**](.md) | Customer list errors. | [optional] 

## Examples

- Prepare the resource
```powershell
$CustomerListRequest = Initialize-PSOpenAPIToolsCustomerListRequest  -Name The Glengarry Glen Ross leads `
 -Records email1@pinterest.com,email2@pinterest.com,..&lt;more records&gt; `
 -ListType null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$CustomerListRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

