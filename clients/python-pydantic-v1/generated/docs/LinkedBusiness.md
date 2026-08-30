# LinkedBusiness


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_large_url** | **str** | image_large_url | [optional] 
**image_medium_url** | **str** | image_medium_url | [optional] 
**image_small_url** | **str** | image_small_url | [optional] 
**image_xlarge_url** | **str** | image_xlarge_url | [optional] 
**username** | **str** | Username | [optional] 

## Example

```python
from openapi_client.models.linked_business import LinkedBusiness

# TODO update the JSON string below
json = "{}"
# create an instance of LinkedBusiness from a JSON string
linked_business_instance = LinkedBusiness.from_json(json)
# print the JSON string representation of the object
print LinkedBusiness.to_json()

# convert the object into a dict
linked_business_dict = linked_business_instance.to_dict()
# create an instance of LinkedBusiness from a dict
linked_business_from_dict = LinkedBusiness.from_dict(linked_business_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


