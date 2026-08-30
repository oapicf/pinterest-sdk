# bulk_campaign_delivery_estimates_item_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | [**list_t**](campaign_planning_ad_group_audience_size.md) \* | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**conversion_rate** | **float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**conversion_rates** | [**list_t**](campaign_planning_conversion_rate.md) \* | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**curves** | [**list_t**](campaign_planning_curve_estimate.md) \* | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**derived_metrics** | [**campaign_delivery_estimates_derived_metrics_t**](campaign_delivery_estimates_derived_metrics.md) \* |  | [optional] 
**errors** | [**list_t**](campaign_planning_response_error.md) \* | Errors encountered during estimation for this campaign. | [optional] 
**estimate_id** | **char \*** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**max_potential_spend** | **int** | Maximum potential spend estimate. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


