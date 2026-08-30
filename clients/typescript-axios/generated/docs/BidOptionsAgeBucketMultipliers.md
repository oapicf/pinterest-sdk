# BidOptionsAgeBucketMultipliers

This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_18_24** | **number** |  | [optional] [default to undefined]
**_25_34** | **number** |  | [optional] [default to undefined]
**_35_44** | **number** |  | [optional] [default to undefined]
**_45_49** | **number** |  | [optional] [default to undefined]
**_50_54** | **number** |  | [optional] [default to undefined]
**_55_64** | **number** |  | [optional] [default to undefined]
**_65** | **number** |  | [optional] [default to undefined]

## Example

```typescript
import { BidOptionsAgeBucketMultipliers } from './api';

const instance: BidOptionsAgeBucketMultipliers = {
    _18_24,
    _25_34,
    _35_44,
    _45_49,
    _50_54,
    _55_64,
    _65,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
