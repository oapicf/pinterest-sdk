# WWW::OpenAPIClient::Object::AdAccount

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdAccount;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] 
**created_time** | **int** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**id** | **string** |  | 
**name** | **string** | Ad account name. | [optional] 
**owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] 
**permissions** | [**ARRAY[BusinessAccessRole]**](BusinessAccessRole.md) |  | [optional] [readonly] 
**updated_time** | **int** |  | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


