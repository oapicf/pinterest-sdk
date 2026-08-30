# CustomerListUpdateWithRequiredBody


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`operation_type`** | [**`*UserListOperationType`**](UserListOperationType.md) | Customer list update operation type (add or remove). Only valid in update request body. | [default to nothing]
**`records`** | **`String`** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] [default to nothing]
**`records_v2`** | [**`Vector{CustomerListRecordRow}`**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


