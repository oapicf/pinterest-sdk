# CatalogsVerticalProductGroupUpdateRequest

Request object for updating a catalog based product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [optional] [default to undefined]
**name** | **string** |  | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [optional] [default to undefined]
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsVerticalProductGroupUpdateRequest } from './api';

const instance: CatalogsVerticalProductGroupUpdateRequest = {
    catalog_type,
    name,
    description,
    filters,
    country,
    locale,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
