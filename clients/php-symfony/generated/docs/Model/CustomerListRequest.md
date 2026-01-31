# CustomerListRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**listType** | [**OpenAPI\Server\Model\UserListType**](UserListType.md) |  | [optional] [default to self::OpenAPI\Server\Model\UserListType_EMAIL]
**name** | **string** | Customer list name. | 
**records** | **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


