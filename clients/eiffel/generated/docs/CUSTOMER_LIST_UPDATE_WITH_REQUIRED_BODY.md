# CUSTOMER_LIST_UPDATE_WITH_REQUIRED_BODY

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation_type** | [**USER_LIST_OPERATION_TYPE**](UserListOperationType.md) | Customer list update operation type (add or remove). Only valid in update request body. | [default to null]
**records** | [**STRING_32**](STRING_32.md) | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] [default to null]
**records_v2** | [**LIST [CUSTOMER_LIST_RECORD_ROW]**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


