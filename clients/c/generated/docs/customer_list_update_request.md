# customer_list_update_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**records** | **char \*** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**operation_type** | **user_list_operation_type_t \*** |  | 
**exceptions** | [**exception_t**](.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


