# openapi::CustomerListRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | Customer list name. | 
**records** | **character** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**list_type** | [**UserListType**](UserListType.md) |  | [optional] [default to &quot;EMAIL&quot;] [Enum: ] 
**exceptions** | **object** | Customer list errors. | [optional] 


