# CatalogsHotelListProductsByCatalogBasedFilterRequest

Request object to list products for a given hotel catalog_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the hotel product group. | [default to undefined]
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsHotelListProductsByCatalogBasedFilterRequest } from './api';

const instance: CatalogsHotelListProductsByCatalogBasedFilterRequest = {
    catalog_type,
    catalog_id,
    filters,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
