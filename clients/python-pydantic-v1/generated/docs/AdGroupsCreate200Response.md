# AdGroupsCreate200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdGroupsCreate200ResponseItemsInner]**](AdGroupsCreate200ResponseItemsInner.md) |  | 

## Example

```python
from openapi_client.models.ad_groups_create200_response import AdGroupsCreate200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupsCreate200Response from a JSON string
ad_groups_create200_response_instance = AdGroupsCreate200Response.from_json(json)
# print the JSON string representation of the object
print AdGroupsCreate200Response.to_json()

# convert the object into a dict
ad_groups_create200_response_dict = ad_groups_create200_response_instance.to_dict()
# create an instance of AdGroupsCreate200Response from a dict
ad_groups_create200_response_from_dict = AdGroupsCreate200Response.from_dict(ad_groups_create200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


