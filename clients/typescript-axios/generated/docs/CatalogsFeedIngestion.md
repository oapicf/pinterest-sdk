# CatalogsFeedIngestion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **string** | Timestamp of the feed ingestion. | [default to undefined]
**feed_id** | **string** | Catalog Feed id pertaining to the feed ingestion. | [default to undefined]
**id** | **string** | Unique identifier of a feed ingestion. | [default to undefined]
**status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) | Status of the feed ingestion. | [default to undefined]

## Example

```typescript
import { CatalogsFeedIngestion } from './api';

const instance: CatalogsFeedIngestion = {
    created_at,
    feed_id,
    id,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
