# CampaignsAnalyticsResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CAMPAIGN_ID** | **string** | The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true. | [optional] [default to undefined]
**DATE** | **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] [default to undefined]

## Example

```typescript
import { CampaignsAnalyticsResponseInner } from './api';

const instance: CampaignsAnalyticsResponseInner = {
    CAMPAIGN_ID,
    DATE,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
