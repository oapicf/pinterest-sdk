# CatalogsRetailListProductsByCatalogBasedFilterRequest

Request object to list products for a given retail catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the retail product group. | [default to undefined]
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsRetailListProductsByCatalogBasedFilterRequest } from './api';

const instance: CatalogsRetailListProductsByCatalogBasedFilterRequest = {
    catalog_type,
    catalog_id,
    filters,
    country,
    locale,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
