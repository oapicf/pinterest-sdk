# TargetingSpecShoppingRetargeting


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exclusion_window** | **number** | Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] [default to undefined]
**lookback_window** | **number** | Number of days ago to start lookback timeframe for dynamic retargeting | [optional] [default to undefined]
**tag_types** | **Array&lt;number&gt;** | Event types to target for dynamic retargeting | [optional] [default to undefined]

## Example

```typescript
import { TargetingSpecShoppingRetargeting } from './api';

const instance: TargetingSpecShoppingRetargeting = {
    exclusion_window,
    lookback_window,
    tag_types,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
