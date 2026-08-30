# CatalogsItemsUpdateBatchRequest

Request object to update catalogs items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [default to undefined]
**items** | [**Array&lt;ItemUpdateBatchRecord&gt;**](ItemUpdateBatchRecord.md) | Array with catalogs items | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]
**operation** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsItemsUpdateBatchRequest } from './api';

const instance: CatalogsItemsUpdateBatchRequest = {
    country,
    items,
    language,
    operation,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
