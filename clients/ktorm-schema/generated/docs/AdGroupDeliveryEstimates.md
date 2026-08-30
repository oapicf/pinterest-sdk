
# Table `AdGroupDeliveryEstimates`
(mapped from: AdGroupDeliveryEstimates)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** |  |  [optional]
**creativeTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupAudienceSizingCreativeTypes&gt;**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupDeliveryEstimatesKeywordsItems&gt;**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. |  [optional]
**monthlyFrequencyCap** | monthly_frequency_cap | int UNSIGNED |  | **kotlin.Int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. |  [optional]
**optimizationGoalMetadata** | optimization_goal_metadata | long |  | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  |  [optional] [foreignkey]
**optimizationType** | optimization_type | long |  | [**OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. |  [optional] [foreignkey]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) |  |  [optional] [foreignkey]
**productGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. |  [optional]
**targetingSpec** | targeting_spec | long |  | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  |  [optional] [foreignkey]



# **Table `AdGroupDeliveryEstimatesAdGroupAudienceSizingCreativeTypes`**
(mapped from: AdGroupDeliveryEstimatesAdGroupAudienceSizingCreativeTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupDeliveryEstimates | adGroupDeliveryEstimates | long | | kotlin.Long | Primary Key | *one*
adGroupAudienceSizingCreativeTypes | adGroupAudienceSizingCreativeTypes | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdGroupDeliveryEstimatesAdGroupDeliveryEstimatesKeywordsItems`**
(mapped from: AdGroupDeliveryEstimatesAdGroupDeliveryEstimatesKeywordsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupDeliveryEstimates | adGroupDeliveryEstimates | long | | kotlin.Long | Primary Key | *one*
adGroupDeliveryEstimatesKeywordsItems | adGroupDeliveryEstimatesKeywordsItems | long | | kotlin.Long | Foreign Key | *many*







# **Table `AdGroupDeliveryEstimatesProductGroupIds`**
(mapped from: AdGroupDeliveryEstimatesProductGroupIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupDeliveryEstimates | adGroupDeliveryEstimates | long | | kotlin.Long | Primary Key | *one*
productGroupIds | productGroupIds | text | | kotlin.String | Foreign Key | *many*




