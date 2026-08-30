# CatalogsHotelProductGroupCreateRequest

Request object for creating a hotel product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog ID pertaining to the product group. | [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | [default to undefined]
**name** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsHotelProductGroupCreateRequest } from './api';

const instance: CatalogsHotelProductGroupCreateRequest = {
    catalog_id,
    catalog_type,
    description,
    filters,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
