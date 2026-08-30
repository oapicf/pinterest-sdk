# CampaignPlanningPointEstimate

A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget** | **number** | The budget value of the point. | [default to undefined]
**double_y** | **number** | Y value as a decimal. | [default to undefined]
**max_y** | **number** | The maximum Y value of the point. | [default to undefined]
**min_y** | **number** | The minimum Y value of the point. | [default to undefined]
**y** | **number** | The expected Y value of the point. | [default to undefined]

## Example

```typescript
import { CampaignPlanningPointEstimate } from './api';

const instance: CampaignPlanningPointEstimate = {
    budget,
    double_y,
    max_y,
    min_y,
    y,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
