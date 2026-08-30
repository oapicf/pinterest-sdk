# BidFloorSpec

Bid floor specification for a given campaign configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billable_event** | [**ActionType**](ActionType.md) | Ad group billable event type. | [default to undefined]
**countries** | [**Array&lt;Country&gt;**](Country.md) | List of ISO 3166-1 alpha-2 country codes. | [optional] [default to undefined]
**creative_type** | [**CreativeType**](CreativeType.md) | Creative type for the bid floor request. | [optional] [default to undefined]
**currency** | [**Currency**](Currency.md) | Currency for the bid floor value. | [default to undefined]
**objective_type** | [**BidFloorObjectiveType**](BidFloorObjectiveType.md) | Campaign objective type. | [optional] [default to undefined]
**optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) | Optimization goal metadata. | [optional] [default to undefined]

## Example

```typescript
import { BidFloorSpec } from './api';

const instance: BidFloorSpec = {
    billable_event,
    countries,
    creative_type,
    currency,
    objective_type,
    optimization_goal_metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
