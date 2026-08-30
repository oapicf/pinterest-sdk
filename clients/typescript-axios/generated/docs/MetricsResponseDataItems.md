# MetricsResponseDataItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | **object** | Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). | [default to undefined]
**targeting_type** | **string** | The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) | [default to undefined]
**targeting_value** | **string** | The targeting value for this data item (e.g., \&#39;christmas decor ideas\&#39;, \&#39;iphone\&#39;, \&#39;female\&#39;) | [default to undefined]

## Example

```typescript
import { MetricsResponseDataItems } from './api';

const instance: MetricsResponseDataItems = {
    metrics,
    targeting_type,
    targeting_value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
