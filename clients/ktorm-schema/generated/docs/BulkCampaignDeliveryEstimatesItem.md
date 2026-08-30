
# Table `BulkCampaignDeliveryEstimatesItem`
(mapped from: BulkCampaignDeliveryEstimatesItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adgroupAudienceSizes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningAdGroupAudienceSize&gt;**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. |  [optional]
**conversionRate** | conversion_rate | float |  | **kotlin.Float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. |  [optional]
**conversionRates** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningConversionRate&gt;**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. |  [optional]
**curves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. |  [optional]
**derivedMetrics** | derived_metrics | long |  | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  |  [optional] [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningResponseError&gt;**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. |  [optional]
**estimateId** | estimate_id | text |  | **kotlin.String** | UUID used to track delivery estimates when they are generated as part of a saved campaign. |  [optional]
**maxPotentialSpend** | max_potential_spend | int |  | **kotlin.Int** | Maximum potential spend estimate. |  [optional]


# **Table `BulkCampaignDeliveryEstimatesItemCampaignPlanningAdGroupAudienceSize`**
(mapped from: BulkCampaignDeliveryEstimatesItemCampaignPlanningAdGroupAudienceSize)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkCampaignDeliveryEstimatesItem | bulkCampaignDeliveryEstimatesItem | long | | kotlin.Long | Primary Key | *one*
campaignPlanningAdGroupAudienceSize | campaignPlanningAdGroupAudienceSize | long | | kotlin.Long | Foreign Key | *many*




# **Table `BulkCampaignDeliveryEstimatesItemCampaignPlanningConversionRate`**
(mapped from: BulkCampaignDeliveryEstimatesItemCampaignPlanningConversionRate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkCampaignDeliveryEstimatesItem | bulkCampaignDeliveryEstimatesItem | long | | kotlin.Long | Primary Key | *one*
campaignPlanningConversionRate | campaignPlanningConversionRate | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkCampaignDeliveryEstimatesItemCampaignPlanningCurveEstimate`**
(mapped from: BulkCampaignDeliveryEstimatesItemCampaignPlanningCurveEstimate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkCampaignDeliveryEstimatesItem | bulkCampaignDeliveryEstimatesItem | long | | kotlin.Long | Primary Key | *one*
campaignPlanningCurveEstimate | campaignPlanningCurveEstimate | long | | kotlin.Long | Foreign Key | *many*




# **Table `BulkCampaignDeliveryEstimatesItemCampaignPlanningResponseError`**
(mapped from: BulkCampaignDeliveryEstimatesItemCampaignPlanningResponseError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkCampaignDeliveryEstimatesItem | bulkCampaignDeliveryEstimatesItem | long | | kotlin.Long | Primary Key | *one*
campaignPlanningResponseError | campaignPlanningResponseError | long | | kotlin.Long | Foreign Key | *many*





