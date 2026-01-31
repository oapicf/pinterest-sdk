# TargetingTemplateCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to True]
**keywords** | [**List[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **str** | targeting template name | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to PlacementGroupType.ALL]
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.targeting_template_common import TargetingTemplateCommon

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateCommon from a JSON string
targeting_template_common_instance = TargetingTemplateCommon.from_json(json)
# print the JSON string representation of the object
print(TargetingTemplateCommon.to_json())

# convert the object into a dict
targeting_template_common_dict = targeting_template_common_instance.to_dict()
# create an instance of TargetingTemplateCommon from a dict
targeting_template_common_from_dict = TargetingTemplateCommon.from_dict(targeting_template_common_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


