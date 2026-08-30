# CatalogsProductGroupCreateRequest

Request object for creating a product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional] [default to undefined]
**feed_id** | **string** | Catalog Feed id pertaining to the catalog product group. | [default to undefined]
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [default to undefined]
**is_featured** | **boolean** | boolean indicator of whether the product group is being featured or not | [optional] [default to undefined]
**name** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsProductGroupCreateRequest } from './api';

const instance: CatalogsProductGroupCreateRequest = {
    description,
    feed_id,
    filters,
    is_featured,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
