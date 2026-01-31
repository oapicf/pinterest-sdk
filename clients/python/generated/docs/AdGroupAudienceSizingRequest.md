# AdGroupAudienceSizingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;. | [optional] [default to True]
**creative_types** | **List[str]** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**List[AdGroupAudienceSizingRequestKeywordsInner]**](AdGroupAudienceSizingRequestKeywordsInner.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [default to 'ALL']
**product_group_ids** | **List[str]** | Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**targeting_spec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_group_audience_sizing_request import AdGroupAudienceSizingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupAudienceSizingRequest from a JSON string
ad_group_audience_sizing_request_instance = AdGroupAudienceSizingRequest.from_json(json)
# print the JSON string representation of the object
print(AdGroupAudienceSizingRequest.to_json())

# convert the object into a dict
ad_group_audience_sizing_request_dict = ad_group_audience_sizing_request_instance.to_dict()
# create an instance of AdGroupAudienceSizingRequest from a dict
ad_group_audience_sizing_request_from_dict = AdGroupAudienceSizingRequest.from_dict(ad_group_audience_sizing_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


