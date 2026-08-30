# CatalogsRetailBatchRequest

A request object that can have multiple operations on a single retail batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**items** | [**Array&lt;CatalogsRetailBatchRequestItemsItems&gt;**](CatalogsRetailBatchRequestItemsItems.md) | Array with catalogs item operations | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]

## Example

```typescript
import { CatalogsRetailBatchRequest } from './api';

const instance: CatalogsRetailBatchRequest = {
    catalog_id,
    catalog_type,
    country,
    items,
    language,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
