# CatalogsItemsUpsertBatchRequest

Request object to upsert catalogs items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]
**operation** | [**BatchOperation**](BatchOperation.md) |  | [default to undefined]
**items** | [**Array&lt;ItemUpsertBatchRecord&gt;**](ItemUpsertBatchRecord.md) | Array with catalogs items | [default to undefined]

## Example

```typescript
import { CatalogsItemsUpsertBatchRequest } from './api';

const instance: CatalogsItemsUpsertBatchRequest = {
    country,
    language,
    operation,
    items,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
