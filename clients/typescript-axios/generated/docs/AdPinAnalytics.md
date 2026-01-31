# AdPinAnalytics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DATE** | **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] [default to undefined]
**PIN_ID** | **string** | The ID of the pin that the metric belongs to. | [default to undefined]

## Example

```typescript
import { AdPinAnalytics } from './api';

const instance: AdPinAnalytics = {
    DATE,
    PIN_ID,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
