# AdGroupDeliveryEstimates
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **Boolean** |  | [optional] 
**CreativeTypes** | [**AdGroupAudienceSizingCreativeTypes[]**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**Keywords** | [**AdGroupDeliveryEstimatesKeywordsItems[]**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**MonthlyFrequencyCap** | **Int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] 
**OptimizationGoalMetadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] 
**OptimizationType** | [**OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**ProductGroupIds** | **String[]** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] 
**TargetingSpec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupDeliveryEstimates = Initialize-PSOpenAPIToolsAdGroupDeliveryEstimates  -AutoTargetingEnabled null `
 -CreativeTypes null `
 -Keywords null `
 -MonthlyFrequencyCap null `
 -OptimizationGoalMetadata null `
 -OptimizationType null `
 -PlacementGroup null `
 -ProductGroupIds null `
 -TargetingSpec null
```

- Convert the resource to JSON
```powershell
$AdGroupDeliveryEstimates | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

