# CatalogsFeedProcessingResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **string** |  | [default to undefined]
**id** | **string** |  | [default to undefined]
**updated_at** | **string** |  | [default to undefined]
**ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | [default to undefined]
**status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | [default to undefined]
**product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | [default to undefined]
**validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsFeedProcessingResult } from './api';

const instance: CatalogsFeedProcessingResult = {
    created_at,
    id,
    updated_at,
    ingestion_details,
    status,
    product_counts,
    validation_details,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
