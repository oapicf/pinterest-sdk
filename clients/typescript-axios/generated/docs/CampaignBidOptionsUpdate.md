# CampaignBidOptionsUpdate

Object describing an update to the campaign level bid multipliers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_bucket_multipliers** | [**AgeBucketMultipliers**](AgeBucketMultipliers.md) | Age bucket multipliers for bid adjustments. | [optional] [default to undefined]
**app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) | App type multipliers for bid adjustments. | [optional] [default to undefined]
**audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) | Audience multipliers for bid adjustments. | [optional] [default to undefined]
**freq_bid_multiplier_time_window** | [**FreqBidMultiplierTimeWindow**](FreqBidMultiplierTimeWindow.md) | The time window for frequency bid multipliers. | [optional] [default to undefined]
**frequency_multipliers** | [**FrequencyMultipliers**](FrequencyMultipliers.md) | Frequency multipliers for bid adjustments. | [optional] [default to undefined]
**gender_multipliers** | [**GenderMultipliers**](GenderMultipliers.md) | Gender multipliers for bid adjustments. | [optional] [default to undefined]
**placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) | Placement multipliers for bid adjustments. | [optional] [default to undefined]
**update_mask** | [**Array&lt;CampaignBidOptionsUpdateMaskItems&gt;**](CampaignBidOptionsUpdateMaskItems.md) | List of fields to update. Only the fields in the list will be updated. | [default to undefined]

## Example

```typescript
import { CampaignBidOptionsUpdate } from './api';

const instance: CampaignBidOptionsUpdate = {
    age_bucket_multipliers,
    app_type_multipliers,
    audience_multipliers,
    freq_bid_multiplier_time_window,
    frequency_multipliers,
    gender_multipliers,
    placement_multipliers,
    update_mask,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
