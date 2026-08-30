# CustomerListUpdateWithRequiredBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OperationType** | [**UserListOperationType**](UserListOperationType.md) | Customer list update operation type (add or remove). Only valid in update request body. | 
**Records** | **String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] 
**RecordsV2** | [**CustomerListRecordRow[]**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] 

## Examples

- Prepare the resource
```powershell
$CustomerListUpdateWithRequiredBody = Initialize-PSOpenAPIToolsCustomerListUpdateWithRequiredBody  -OperationType null `
 -Records email1@pinterest.com,email2@pinterest.com,..&lt;more records&gt; `
 -RecordsV2 null
```

- Convert the resource to JSON
```powershell
$CustomerListUpdateWithRequiredBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

