# CustomerListRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String!** | Customer list name. | [default to null]
**records** | **String!** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [default to null]
**listType** | [***UserListType**](UserListType.md) |  | [optional] [default to EMAIL]
**exceptions** | [***TodoObjectMapping**](.md) | Customer list errors. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


