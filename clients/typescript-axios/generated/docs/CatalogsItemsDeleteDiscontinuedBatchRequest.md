# CatalogsItemsDeleteDiscontinuedBatchRequest

Request object to discontinue catalogs items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [default to undefined]
**items** | [**Array&lt;ItemDeleteDiscontinuedBatchRecord&gt;**](ItemDeleteDiscontinuedBatchRecord.md) | Array with catalogs items | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]
**operation** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsItemsDeleteDiscontinuedBatchRequest } from './api';

const instance: CatalogsItemsDeleteDiscontinuedBatchRequest = {
    country,
    items,
    language,
    operation,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
