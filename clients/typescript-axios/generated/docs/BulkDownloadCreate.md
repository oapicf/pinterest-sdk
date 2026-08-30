# BulkDownloadCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_filter** | [**BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  | [optional] [default to undefined]
**entity_ids** | **Array&lt;string&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] [default to undefined]
**entity_types** | [**Array&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] [default to undefined]
**output_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to undefined]
**updated_since** | **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] [default to undefined]

## Example

```typescript
import { BulkDownloadCreate } from './api';

const instance: BulkDownloadCreate = {
    campaign_filter,
    entity_ids,
    entity_types,
    output_format,
    updated_since,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
