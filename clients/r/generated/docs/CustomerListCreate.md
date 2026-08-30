# openapi::CustomerListCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_nca** | **character** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**list_type** | [**UserListType**](UserListType.md) | Type of customer list (e.g., EMAIL, IDFA, MAID). | [optional] [Enum: ] 
**name** | **character** | Customer list name. | 
**records** | **character** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] 
**records_v2** | [**array[CustomerListRecordRow]**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] 


