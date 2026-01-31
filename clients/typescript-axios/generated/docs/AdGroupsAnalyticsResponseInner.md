# AdGroupsAnalyticsResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AD_GROUP_ID** | **string** | The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. | [optional] [default to undefined]
**DATE** | **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] [default to undefined]

## Example

```typescript
import { AdGroupsAnalyticsResponseInner } from './api';

const instance: AdGroupsAnalyticsResponseInner = {
    AD_GROUP_ID,
    DATE,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
