# BulkDownloadRequest

Ad entities to get in bulk request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_types** | [**Array&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] [default to undefined]
**entity_ids** | **Array&lt;string&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] [default to undefined]
**updated_since** | **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] [default to undefined]
**campaign_filter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] [default to undefined]
**output_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to BulkOutputFormat_Json]

## Example

```typescript
import { BulkDownloadRequest } from './api';

const instance: BulkDownloadRequest = {
    entity_types,
    entity_ids,
    updated_since,
    campaign_filter,
    output_format,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
