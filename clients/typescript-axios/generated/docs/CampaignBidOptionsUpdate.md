# CampaignBidOptionsUpdate

Object describing an update to the campaign level bid multipliers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] [default to undefined]
**audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] [default to undefined]
**placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] [default to undefined]
**update_mask** | **Array&lt;string&gt;** | List of fields to update, only the fields in the list will be updated. | [default to undefined]

## Example

```typescript
import { CampaignBidOptionsUpdate } from './api';

const instance: CampaignBidOptionsUpdate = {
    app_type_multipliers,
    audience_multipliers,
    placement_multipliers,
    update_mask,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
