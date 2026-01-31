# TargetingTemplateCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to True]
**keywords** | [**List[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **str** | Name of targeting template. | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to PlacementGroupType.ALL]
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.targeting_template_create import TargetingTemplateCreate

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateCreate from a JSON string
targeting_template_create_instance = TargetingTemplateCreate.from_json(json)
# print the JSON string representation of the object
print(TargetingTemplateCreate.to_json())

# convert the object into a dict
targeting_template_create_dict = targeting_template_create_instance.to_dict()
# create an instance of TargetingTemplateCreate from a dict
targeting_template_create_from_dict = TargetingTemplateCreate.from_dict(targeting_template_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


