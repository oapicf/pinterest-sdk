# CatalogsItemsBatchPostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**items** | [**Array&lt;ItemDeleteBatchRecord&gt;**](ItemDeleteBatchRecord.md) | Array with catalogs items | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]
**operation** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsItemsBatchPostRequest } from './api';

const instance: CatalogsItemsBatchPostRequest = {
    catalog_id,
    catalog_type,
    country,
    items,
    language,
    operation,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
