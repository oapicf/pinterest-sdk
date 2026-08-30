# CatalogsVerticalsListProductsByCatalogBasedFilterRequest

Request object to list products for a given catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog ID pertaining to the product group. | [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [default to undefined]
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsVerticalsListProductsByCatalogBasedFilterRequest } from './api';

const instance: CatalogsVerticalsListProductsByCatalogBasedFilterRequest = {
    catalog_id,
    catalog_type,
    country,
    filters,
    locale,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
