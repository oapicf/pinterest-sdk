# CUSTOMER_LIST_CREATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_nca** | **BOOLEAN** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] [default to null]
**list_type** | [**USER_LIST_TYPE**](UserListType.md) | Type of customer list (e.g., EMAIL, IDFA, MAID). | [optional] [default to EMAIL]
**name** | [**STRING_32**](STRING_32.md) | Customer list name. | [default to null]
**records** | [**STRING_32**](STRING_32.md) | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] [default to null]
**records_v2** | [**LIST [CUSTOMER_LIST_RECORD_ROW]**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


