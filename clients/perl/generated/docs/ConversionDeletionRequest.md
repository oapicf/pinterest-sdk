# WWW::OpenAPIClient::Object::ConversionDeletionRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ConversionDeletionRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_time** | **DATE** | Timestamp when the conversion deletion request was succesfully created. | [readonly] 
**processed_time** | **DATE** | Timestamp when the conversion deletion request was processed. | [optional] [readonly] 
**request_id** | **string** | Unique identifier of the conversion deletion request | 
**status** | [**ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


