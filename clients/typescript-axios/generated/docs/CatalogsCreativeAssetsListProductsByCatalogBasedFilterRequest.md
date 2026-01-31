# CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

Request object to list products for a given creative assets catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the creative assets product group. | [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest } from './api';

const instance: CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = {
    catalog_id,
    catalog_type,
    filters,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
