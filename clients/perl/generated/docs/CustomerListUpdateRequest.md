# WWW::OpenAPIClient::Object::CustomerListUpdateRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CustomerListUpdateRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**records** | **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**operation_type** | [**UserListOperationType**](UserListOperationType.md) |  | 
**exceptions** | [**Exception**](.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


