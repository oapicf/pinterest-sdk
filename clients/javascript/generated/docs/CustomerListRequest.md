# PinterestSdk.CustomerListRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Customer list name. | 
**records** | **String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**listType** | [**UserListType**](UserListType.md) |  | [optional] [default to &#39;EMAIL&#39;]
**exceptions** | **Object** | Customer list errors. | [optional] 


