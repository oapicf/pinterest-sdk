# CatalogsVerticalProductGroupCreateRequest

Request object for creating a catalog based product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the creative assets product group. | [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [default to undefined]
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] [default to undefined]
**name** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsVerticalProductGroupCreateRequest } from './api';

const instance: CatalogsVerticalProductGroupCreateRequest = {
    catalog_id,
    catalog_type,
    country,
    description,
    filters,
    locale,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
