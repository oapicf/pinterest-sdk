# CatalogsCreativeAssetsProductGroupCreateRequest

Request object for creating a creative assets product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the creative assets product group. | [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [default to undefined]
**name** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsCreativeAssetsProductGroupCreateRequest } from './api';

const instance: CatalogsCreativeAssetsProductGroupCreateRequest = {
    catalog_id,
    catalog_type,
    description,
    filters,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
