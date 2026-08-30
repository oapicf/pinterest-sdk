# CatalogsFeedProcessingResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **string** |  | [readonly] [default to undefined]
**id** | **string** | ID of the feed processing result. | [default to undefined]
**ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | [default to undefined]
**product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | [default to undefined]
**status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | [default to undefined]
**updated_at** | **string** |  | [readonly] [default to undefined]
**validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | [default to undefined]
**video_counts** | [**CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsFeedProcessingResult } from './api';

const instance: CatalogsFeedProcessingResult = {
    created_at,
    id,
    ingestion_details,
    product_counts,
    status,
    updated_at,
    validation_details,
    video_counts,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
