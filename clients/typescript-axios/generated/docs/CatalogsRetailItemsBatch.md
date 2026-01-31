# CatalogsRetailItemsBatch

Object describing the catalogs retail items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the catalogs items batch | [optional] [default to undefined]
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**completed_time** | **string** | Date and time (UTC) of the batch completion: YYYY-MM-DD\&#39;T\&#39;hh:mm:ss | [optional] [readonly] [default to undefined]
**created_time** | **string** | Date and time (UTC) of the batch creation: YYYY-MM-DD\&#39;T\&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | [readonly] [default to undefined]
**items** | [**Array&lt;ItemProcessingRecord&gt;**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to undefined]
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsRetailItemsBatch } from './api';

const instance: CatalogsRetailItemsBatch = {
    batch_id,
    catalog_type,
    completed_time,
    created_time,
    items,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
