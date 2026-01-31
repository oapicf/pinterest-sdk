# CatalogsHotelProductGroupCreateRequest

Request object for creating a hotel product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [default to undefined]
**name** | **string** |  | [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the hotel product group. | [default to undefined]

## Example

```typescript
import { CatalogsHotelProductGroupCreateRequest } from './api';

const instance: CatalogsHotelProductGroupCreateRequest = {
    catalog_type,
    name,
    description,
    filters,
    catalog_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
