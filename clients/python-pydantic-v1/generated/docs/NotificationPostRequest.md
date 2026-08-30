# NotificationPostRequest

Notification request body. Can be either a batch of notification objects or a single notification object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapi_client.models.notification_post_request import NotificationPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of NotificationPostRequest from a JSON string
notification_post_request_instance = NotificationPostRequest.from_json(json)
# print the JSON string representation of the object
print NotificationPostRequest.to_json()

# convert the object into a dict
notification_post_request_dict = notification_post_request_instance.to_dict()
# create an instance of NotificationPostRequest from a dict
notification_post_request_from_dict = NotificationPostRequest.from_dict(notification_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


