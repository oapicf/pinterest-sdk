# CUSTOMER_LIST_UPDATE_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**records** | [**STRING_32**](STRING_32.md) | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [default to null]
**operation_type** | [**USER_LIST_OPERATION_TYPE**](UserListOperationType.md) |  | [default to null]
**exceptions** | [**EXCEPTION**](.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


