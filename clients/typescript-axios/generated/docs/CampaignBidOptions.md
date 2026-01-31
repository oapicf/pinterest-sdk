# CampaignBidOptions

Object describing the campaign level bid multipliers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] [default to undefined]
**audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] [default to undefined]
**placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CampaignBidOptions } from './api';

const instance: CampaignBidOptions = {
    app_type_multipliers,
    audience_multipliers,
    placement_multipliers,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
