# TargetingTemplate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to True]
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**id** | **str** | Targeting template ID. | [optional] [readonly] 
**keywords** | [**List[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **str** | targeting template name | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] 
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**valid** | **bool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

## Example

```python
from openapi_client.models.targeting_template import TargetingTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplate from a JSON string
targeting_template_instance = TargetingTemplate.from_json(json)
# print the JSON string representation of the object
print TargetingTemplate.to_json()

# convert the object into a dict
targeting_template_dict = targeting_template_instance.to_dict()
# create an instance of TargetingTemplate from a dict
targeting_template_from_dict = TargetingTemplate.from_dict(targeting_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


