# CatalogsItemsBatch

Object describing the catalogs items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**batch_id** | **string** | Id of the catalogs items batch | [optional] [default to undefined]
**completed_time** | **string** | Date and time (UTC) of the batch completion: YYYY-MM-DD\&#39;T\&#39;hh:mm:ss | [optional] [readonly] [default to undefined]
**created_time** | **string** | Date and time (UTC) of the batch creation: YYYY-MM-DD\&#39;T\&#39;hh:mm:ss | [readonly] [default to undefined]
**items** | [**Array&lt;CreativeAssetsProcessingRecord&gt;**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to undefined]
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsItemsBatch } from './api';

const instance: CatalogsItemsBatch = {
    catalog_type,
    batch_id,
    completed_time,
    created_time,
    items,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
