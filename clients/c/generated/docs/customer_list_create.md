# customer_list_create_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_nca** | **int** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**list_type** | **user_list_type_t \*** | Type of customer list (e.g., EMAIL, IDFA, MAID). | [optional] 
**name** | **char \*** | Customer list name. | 
**records** | **char \*** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] 
**records_v2** | [**list_t**](customer_list_record_row.md) \* | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


