# CatalogsListProductsByFilterRequest

Request object to list products for a given product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **string** | Catalog Feed id pertaining to the catalog product group filter. | [default to undefined]
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsListProductsByFilterRequest } from './api';

const instance: CatalogsListProductsByFilterRequest = {
    feed_id,
    filters,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
