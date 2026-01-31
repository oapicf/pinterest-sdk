# CatalogsFeedVideoCounts

Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ingested_videos** | **number** | The number of videos successfully ingested from the feed file. | [optional] [default to undefined]
**not_ingested_videos** | **number** | The number of videos that were not ingested from the feed file. | [optional] [default to undefined]
**total_videos** | **number** | The number of videos in the feed file. | [optional] [default to undefined]

## Example

```typescript
import { CatalogsFeedVideoCounts } from './api';

const instance: CatalogsFeedVideoCounts = {
    ingested_videos,
    not_ingested_videos,
    total_videos,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
