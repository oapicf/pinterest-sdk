# CatalogsItemsBatchRequest

Request object of catalogs items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]
**operation** | [**BatchOperation**](BatchOperation.md) |  | [default to undefined]
**items** | [**Array&lt;ItemDeleteBatchRecord&gt;**](ItemDeleteBatchRecord.md) | Array with catalogs items | [default to undefined]

## Example

```typescript
import { CatalogsItemsBatchRequest } from './api';

const instance: CatalogsItemsBatchRequest = {
    country,
    language,
    operation,
    items,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
