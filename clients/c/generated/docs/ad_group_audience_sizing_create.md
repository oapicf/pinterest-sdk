# ad_group_audience_sizing_create_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **int** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to true]
**creative_types** | [**list_t**](ad_group_audience_sizing_creative_types.md) \* | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**list_t**](ad_group_audience_sizing_keyword.md) \* | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**placement_group** | **adgroup_placement_group_type_t \*** | [Placement group](/docs/redoc/#section/Placement-group). | [optional] 
**product_group_ids** | **list_t \*** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**targeting_spec** | [**targeting_spec_optimal_t**](targeting_spec_optimal.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


