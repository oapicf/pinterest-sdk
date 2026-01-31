# CatalogsVerticalsListProductsByCatalogBasedFilterRequest

Request object to list products for a given catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the creative assets product group. | [default to undefined]
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsVerticalsListProductsByCatalogBasedFilterRequest } from './api';

const instance: CatalogsVerticalsListProductsByCatalogBasedFilterRequest = {
    catalog_type,
    catalog_id,
    filters,
    country,
    locale,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
