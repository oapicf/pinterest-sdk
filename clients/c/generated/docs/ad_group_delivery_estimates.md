# ad_group_delivery_estimates_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **int** |  | [optional] 
**creative_types** | [**list_t**](ad_group_audience_sizing_creative_types.md) \* | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**list_t**](ad_group_delivery_estimates_keywords_items.md) \* | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**monthly_frequency_cap** | **int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] 
**optimization_goal_metadata** | [**optimization_goal_metadata_t**](optimization_goal_metadata.md) \* |  | [optional] 
**optimization_type** | **optimization_type_t \*** | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] 
**placement_group** | **placement_group_type_t \*** |  | [optional] 
**product_group_ids** | **list_t \*** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] 
**targeting_spec** | [**targeting_spec_optimal_t**](targeting_spec_optimal.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


