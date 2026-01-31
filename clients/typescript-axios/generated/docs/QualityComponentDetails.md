# QualityComponentDetails

Metrics for a specific event type within a quality component.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverage** | **number** | Coverage percentage for this event type. | [default to undefined]
**issues** | [**Array&lt;QualityComponentIssue&gt;**](QualityComponentIssue.md) | List of issues detected for this event type, if any. | [optional] [default to undefined]
**overlap** | **number** | Overlap percentage for this event type. Only populated for external_event_id | [optional] [default to undefined]

## Example

```typescript
import { QualityComponentDetails } from './api';

const instance: QualityComponentDetails = {
    coverage,
    issues,
    overlap,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
