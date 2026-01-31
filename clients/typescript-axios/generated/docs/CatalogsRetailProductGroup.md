# CatalogsRetailProductGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [default to undefined]
**id** | **string** | ID of the catalog product group. | [default to undefined]
**name** | **string** | Name of catalog product group | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | [default to undefined]
**is_featured** | **boolean** | boolean indicator of whether the product group is being featured or not | [optional] [default to undefined]
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] [default to undefined]
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] [default to undefined]
**created_at** | **number** | Unix timestamp in seconds of when catalog product group was created. | [optional] [default to undefined]
**updated_at** | **number** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the retail product group. | [default to undefined]
**feed_id** | **string** | id of the catalogs feed belonging to this catalog product group | [default to undefined]
**country** | **string** |  | [optional] [default to undefined]
**locale** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsRetailProductGroup } from './api';

const instance: CatalogsRetailProductGroup = {
    catalog_type,
    id,
    name,
    description,
    filters,
    is_featured,
    type,
    status,
    created_at,
    updated_at,
    catalog_id,
    feed_id,
    country,
    locale,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
