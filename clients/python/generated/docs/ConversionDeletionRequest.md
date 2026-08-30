# ConversionDeletionRequest

Conversion deletion request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_time** | **date** | Timestamp when the conversion deletion request was succesfully created. | [readonly] 
**processed_time** | **date** | Timestamp when the conversion deletion request was processed. | [optional] [readonly] 
**request_id** | **str** | Unique identifier of the conversion deletion request | 
**status** | [**ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. | [readonly] 

## Example

```python
from pinterestsdk.models.conversion_deletion_request import ConversionDeletionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionDeletionRequest from a JSON string
conversion_deletion_request_instance = ConversionDeletionRequest.from_json(json)
# print the JSON string representation of the object
print(ConversionDeletionRequest.to_json())

# convert the object into a dict
conversion_deletion_request_dict = conversion_deletion_request_instance.to_dict()
# create an instance of ConversionDeletionRequest from a dict
conversion_deletion_request_from_dict = ConversionDeletionRequest.from_dict(conversion_deletion_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


