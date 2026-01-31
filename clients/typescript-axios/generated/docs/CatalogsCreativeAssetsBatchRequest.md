# CatalogsCreativeAssetsBatchRequest

Request object to update catalogs creative assets items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]
**items** | [**Array&lt;CatalogsCreativeAssetsBatchItem&gt;**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [default to undefined]

## Example

```typescript
import { CatalogsCreativeAssetsBatchRequest } from './api';

const instance: CatalogsCreativeAssetsBatchRequest = {
    catalog_type,
    country,
    language,
    items,
    catalog_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
