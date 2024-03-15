# OAICustomerListRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **NSString*** | Customer list name. | 
**records** | **NSString*** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**listType** | [**OAIUserListType***](OAIUserListType.md) |  | [optional] [default to @"EMAIL"]
**exceptions** | [**NSObject***](.md) | Customer list errors. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


