# TargetingTemplateResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to True]
**keywords** | [**List[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **str** | targeting template name | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to PlacementGroupType.ALL]
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**ad_account_id** | **str** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**id** | **str** | Targeting template ID. | [optional] 
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**status** | **str** | Indicate targeting template is active or Deleted | [optional] [default to 'ACTIVE']
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 

## Example

```python
from pinterestsdk.models.targeting_template_response_data import TargetingTemplateResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateResponseData from a JSON string
targeting_template_response_data_instance = TargetingTemplateResponseData.from_json(json)
# print the JSON string representation of the object
print(TargetingTemplateResponseData.to_json())

# convert the object into a dict
targeting_template_response_data_dict = targeting_template_response_data_instance.to_dict()
# create an instance of TargetingTemplateResponseData from a dict
targeting_template_response_data_from_dict = TargetingTemplateResponseData.from_dict(targeting_template_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


