# CatalogsItemsDeleteBatchRequest

Request object to delete catalogs items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [default to undefined]
**items** | [**Array&lt;ItemDeleteBatchRecord&gt;**](ItemDeleteBatchRecord.md) | Array with catalogs items | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]
**operation** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsItemsDeleteBatchRequest } from './api';

const instance: CatalogsItemsDeleteBatchRequest = {
    country,
    items,
    language,
    operation,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
