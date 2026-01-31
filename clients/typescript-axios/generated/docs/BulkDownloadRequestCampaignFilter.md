# BulkDownloadRequestCampaignFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_status** | [**Array&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) |  | [optional] [default to undefined]
**end_time** | **string** | Unix UTC timestamp. | [optional] [default to undefined]
**name** | **string** | Campaign name | [optional] [default to undefined]
**objective_type** | [**Array&lt;ObjectiveType&gt;**](ObjectiveType.md) |  | [optional] [default to undefined]
**start_time** | **string** | Unix UTC timestamp. | [optional] [default to undefined]

## Example

```typescript
import { BulkDownloadRequestCampaignFilter } from './api';

const instance: BulkDownloadRequestCampaignFilter = {
    campaign_status,
    end_time,
    name,
    objective_type,
    start_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
