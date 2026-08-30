# TargetingTemplateCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to True]
**keywords** | [**List[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **str** | targeting template name | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

## Example

```python
from openapi_client.models.targeting_template_create import TargetingTemplateCreate

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateCreate from a JSON string
targeting_template_create_instance = TargetingTemplateCreate.from_json(json)
# print the JSON string representation of the object
print TargetingTemplateCreate.to_json()

# convert the object into a dict
targeting_template_create_dict = targeting_template_create_instance.to_dict()
# create an instance of TargetingTemplateCreate from a dict
targeting_template_create_from_dict = TargetingTemplateCreate.from_dict(targeting_template_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


