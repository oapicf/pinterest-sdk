
# Table `CampaignBidOptionsUpdate`
(mapped from: CampaignBidOptionsUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**updateMask** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignBidOptionsUpdateMaskItems&gt;**](CampaignBidOptionsUpdateMaskItems.md) | List of fields to update. Only the fields in the list will be updated. | 
**ageBucketMultipliers** | age_bucket_multipliers | long |  | [**AgeBucketMultipliers**](AgeBucketMultipliers.md) | Age bucket multipliers for bid adjustments. |  [optional] [foreignkey]
**appTypeMultipliers** | app_type_multipliers | long |  | [**AppTypeMultipliers**](AppTypeMultipliers.md) | App type multipliers for bid adjustments. |  [optional] [foreignkey]
**audienceMultipliers** | audience_multipliers | long |  | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) | Audience multipliers for bid adjustments. |  [optional] [foreignkey]
**freqBidMultiplierTimeWindow** | freq_bid_multiplier_time_window | long |  | [**FreqBidMultiplierTimeWindow**](FreqBidMultiplierTimeWindow.md) | The time window for frequency bid multipliers. |  [optional] [foreignkey]
**frequencyMultipliers** | frequency_multipliers | long |  | [**FrequencyMultipliers**](FrequencyMultipliers.md) | Frequency multipliers for bid adjustments. |  [optional] [foreignkey]
**genderMultipliers** | gender_multipliers | long |  | [**GenderMultipliers**](GenderMultipliers.md) | Gender multipliers for bid adjustments. |  [optional] [foreignkey]
**placementMultipliers** | placement_multipliers | long |  | [**PlacementMultipliers**](PlacementMultipliers.md) | Placement multipliers for bid adjustments. |  [optional] [foreignkey]


# **Table `CampaignBidOptionsUpdateCampaignBidOptionsUpdateMaskItems`**
(mapped from: CampaignBidOptionsUpdateCampaignBidOptionsUpdateMaskItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignBidOptionsUpdate | campaignBidOptionsUpdate | long | | kotlin.Long | Primary Key | *one*
campaignBidOptionsUpdateMaskItems | campaignBidOptionsUpdateMaskItems | long | | kotlin.Long | Foreign Key | *many*










