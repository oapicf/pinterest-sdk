# AdGroupDeliveryEstimates
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **auto\_targeting\_enabled** | **Boolean** |  | [optional] [default to null] |
| **creative\_types** | [**List**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to null] |
| **keywords** | [**List**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to null] |
| **monthly\_frequency\_cap** | **Integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] [default to null] |
| **optimization\_goal\_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] [default to null] |
| **optimization\_type** | [**OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] [default to null] |
| **placement\_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to null] |
| **product\_group\_ids** | **List** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] [default to null] |
| **targeting\_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

