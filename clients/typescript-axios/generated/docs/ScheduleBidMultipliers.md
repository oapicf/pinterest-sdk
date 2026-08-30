# ScheduleBidMultipliers

The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_bucket_multipliers** | [**BidOptionsAgeBucketMultipliers**](BidOptionsAgeBucketMultipliers.md) |  | [optional] [default to undefined]
**app_type_multipliers** | [**BidOptionsAppTypeMultipliers**](BidOptionsAppTypeMultipliers.md) |  | [optional] [default to undefined]
**audience_multipliers** | [**Array&lt;BidOptionsAudienceMultipliers&gt;**](BidOptionsAudienceMultipliers.md) |  | [optional] [default to undefined]
**gender_multipliers** | [**BidOptionsGenderMultipliers**](BidOptionsGenderMultipliers.md) |  | [optional] [default to undefined]
**placement_multipliers** | [**BidOptionsPlacementMultipliers**](BidOptionsPlacementMultipliers.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ScheduleBidMultipliers } from './api';

const instance: ScheduleBidMultipliers = {
    age_bucket_multipliers,
    app_type_multipliers,
    audience_multipliers,
    gender_multipliers,
    placement_multipliers,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
