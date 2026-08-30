# AdGroupAudienceSizingCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to True]
**creative_types** | [**List[AdGroupAudienceSizingCreativeTypes]**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**List[AdGroupAudienceSizingKeyword]**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**placement_group** | [**AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] 
**product_group_ids** | **List[str]** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

## Example

```python
from openapi_client.models.ad_group_audience_sizing_create import AdGroupAudienceSizingCreate

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupAudienceSizingCreate from a JSON string
ad_group_audience_sizing_create_instance = AdGroupAudienceSizingCreate.from_json(json)
# print the JSON string representation of the object
print AdGroupAudienceSizingCreate.to_json()

# convert the object into a dict
ad_group_audience_sizing_create_dict = ad_group_audience_sizing_create_instance.to_dict()
# create an instance of AdGroupAudienceSizingCreate from a dict
ad_group_audience_sizing_create_from_dict = AdGroupAudienceSizingCreate.from_dict(ad_group_audience_sizing_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


