# AudienceCategory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Interest ID. | [optional] 
**index** | **float** | Interest affinity index. | [optional] 
**key** | **str** | Interest unique key (same as ID). | [optional] 
**name** | **str** | Interest name. | [optional] 
**ratio** | **float** | Interest&#39;s percent of category&#39;s total audience. | [optional] 
**subcategories** | [**List[AudienceSubcategory]**](AudienceSubcategory.md) | Subcategory interest distribution | [optional] 

## Example

```python
from pinterestsdk.models.audience_category import AudienceCategory

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceCategory from a JSON string
audience_category_instance = AudienceCategory.from_json(json)
# print the JSON string representation of the object
print(AudienceCategory.to_json())

# convert the object into a dict
audience_category_dict = audience_category_instance.to_dict()
# create an instance of AudienceCategory from a dict
audience_category_from_dict = AudienceCategory.from_dict(audience_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


