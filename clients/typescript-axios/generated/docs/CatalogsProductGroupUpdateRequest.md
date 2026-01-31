# CatalogsProductGroupUpdateRequest

Request object for updating a product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] [default to undefined]
**is_featured** | **boolean** | boolean indicator of whether the product group is being featured or not | [optional] [default to undefined]
**name** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsProductGroupUpdateRequest } from './api';

const instance: CatalogsProductGroupUpdateRequest = {
    description,
    filters,
    is_featured,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
