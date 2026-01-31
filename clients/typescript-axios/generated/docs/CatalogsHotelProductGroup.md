# CatalogsHotelProductGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the hotel product group. | [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**created_at** | **number** | Unix timestamp in seconds of when catalog product group was created. | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | [default to undefined]
**id** | **string** | ID of the hotel product group. | [default to undefined]
**name** | **string** | Name of hotel product group | [optional] [default to undefined]
**type** | [**CatalogsHotelProductGroupType**](CatalogsHotelProductGroupType.md) |  | [default to undefined]
**updated_at** | **number** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] [default to undefined]

## Example

```typescript
import { CatalogsHotelProductGroup } from './api';

const instance: CatalogsHotelProductGroup = {
    catalog_id,
    catalog_type,
    created_at,
    description,
    filters,
    id,
    name,
    type,
    updated_at,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
