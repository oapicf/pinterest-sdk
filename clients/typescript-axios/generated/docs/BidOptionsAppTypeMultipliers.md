# BidOptionsAppTypeMultipliers

This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**android_mobile** | **number** |  | [optional] [default to undefined]
**android_tablet** | **number** |  | [optional] [default to undefined]
**ipad** | **number** |  | [optional] [default to undefined]
**iphone** | **number** |  | [optional] [default to undefined]
**web** | **number** |  | [optional] [default to undefined]
**web_mobile** | **number** |  | [optional] [default to undefined]

## Example

```typescript
import { BidOptionsAppTypeMultipliers } from './api';

const instance: BidOptionsAppTypeMultipliers = {
    android_mobile,
    android_tablet,
    ipad,
    iphone,
    web,
    web_mobile,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
