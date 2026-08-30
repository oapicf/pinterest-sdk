# CampaignBatchItem

Item in a batch campaign response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**CampaignBatchResponseData**](CampaignBatchResponseData.md) | Campaign data on success. | [optional] [default to undefined]
**exceptions** | [**Array&lt;Exception&gt;**](Exception.md) | Exceptions on failure. | [optional] [default to undefined]

## Example

```typescript
import { CampaignBatchItem } from './api';

const instance: CampaignBatchItem = {
    data,
    exceptions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
