# AudienceSubcategory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Subinterest ID. | [optional] 
**index** | **float** | Subinterest affinity index. | [optional] 
**key** | **str** | Interest unique key (same as ID). | [optional] 
**name** | **str** | Subinterest name. | [optional] 
**ratio** | **float** | Subinterest&#39;s percent of category&#39;s total audience. | [optional] 

## Example

```python
from pinterestsdk.models.audience_subcategory import AudienceSubcategory

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceSubcategory from a JSON string
audience_subcategory_instance = AudienceSubcategory.from_json(json)
# print the JSON string representation of the object
print(AudienceSubcategory.to_json())

# convert the object into a dict
audience_subcategory_dict = audience_subcategory_instance.to_dict()
# create an instance of AudienceSubcategory from a dict
audience_subcategory_from_dict = AudienceSubcategory.from_dict(audience_subcategory_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


