# BulkDownloadCampaignFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_status** | [**Array&lt;SummaryStatus&gt;**](SummaryStatus.md) |  | [optional] [default to undefined]
**end_time** | **string** | Unix UTC timestamp. | [optional] [default to undefined]
**name** | **string** | Campaign name | [optional] [default to undefined]
**objective_type** | [**Array&lt;ConversionObjectiveType&gt;**](ConversionObjectiveType.md) |  | [optional] [default to undefined]
**start_time** | **string** | Unix UTC timestamp. | [optional] [default to undefined]

## Example

```typescript
import { BulkDownloadCampaignFilter } from './api';

const instance: BulkDownloadCampaignFilter = {
    campaign_status,
    end_time,
    name,
    objective_type,
    start_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
