# # CustomerListRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Customer list name. |
**records** | **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. |
**list_type** | [**\OpenAPI\Client\Model\UserListType**](UserListType.md) |  | [optional] [default to self::\OpenAPI\Client\Model\UserListType_EMAIL]
**exceptions** | **object** | Customer list errors. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
