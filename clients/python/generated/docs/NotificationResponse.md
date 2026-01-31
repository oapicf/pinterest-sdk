# NotificationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **bool** | Returns true if the notification accepted. | [optional] 
**received_at** | **int** | Received time. Unix timestamp in seconds. | [optional] 
**error_msg** | **str** | error message when success is false | [optional] 

## Example

```python
from pinterestsdk.models.notification_response import NotificationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of NotificationResponse from a JSON string
notification_response_instance = NotificationResponse.from_json(json)
# print the JSON string representation of the object
print(NotificationResponse.to_json())

# convert the object into a dict
notification_response_dict = notification_response_instance.to_dict()
# create an instance of NotificationResponse from a dict
notification_response_from_dict = NotificationResponse.from_dict(notification_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


