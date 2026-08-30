# MediaList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Media]**](Media.md) |  | 

## Example

```python
from openapi_client.models.media_list200_response import MediaList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of MediaList200Response from a JSON string
media_list200_response_instance = MediaList200Response.from_json(json)
# print the JSON string representation of the object
print MediaList200Response.to_json()

# convert the object into a dict
media_list200_response_dict = media_list200_response_instance.to_dict()
# create an instance of MediaList200Response from a dict
media_list200_response_from_dict = MediaList200Response.from_dict(media_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


