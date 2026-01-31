# CatalogsHotelItemsBatch

Object describing the catalogs hotel items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | Id of the catalogs items batch | [optional] [default to undefined]
**created_time** | **string** | Date and time (UTC) of the batch creation: YYYY-MM-DD\&#39;T\&#39;hh:mm:ss | [optional] [readonly] [default to undefined]
**completed_time** | **string** | Date and time (UTC) of the batch completion: YYYY-MM-DD\&#39;T\&#39;hh:mm:ss | [optional] [readonly] [default to undefined]
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] [default to undefined]
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**items** | [**Array&lt;HotelProcessingRecord&gt;**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] [default to undefined]

## Example

```typescript
import { CatalogsHotelItemsBatch } from './api';

const instance: CatalogsHotelItemsBatch = {
    batch_id,
    created_time,
    completed_time,
    status,
    catalog_type,
    items,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
