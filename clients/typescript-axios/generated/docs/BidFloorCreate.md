# BidFloorCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_floor_specs** | [**Array&lt;BidFloorSpec&gt;**](BidFloorSpec.md) | List of bid floor specifications. | [default to undefined]
**targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | Ad group targeting specification defining the ad group target audience. | [optional] [default to undefined]

## Example

```typescript
import { BidFloorCreate } from './api';

const instance: BidFloorCreate = {
    bid_floor_specs,
    targeting_spec,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
