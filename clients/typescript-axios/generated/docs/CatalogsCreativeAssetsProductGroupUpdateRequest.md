# CatalogsCreativeAssetsProductGroupUpdateRequest

Request object for updating a creative assets product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [optional] [default to undefined]
**name** | **string** | Name of catalog product group | [optional] [default to undefined]

## Example

```typescript
import { CatalogsCreativeAssetsProductGroupUpdateRequest } from './api';

const instance: CatalogsCreativeAssetsProductGroupUpdateRequest = {
    catalog_type,
    description,
    filters,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
