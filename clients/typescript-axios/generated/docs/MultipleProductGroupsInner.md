# MultipleProductGroupsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** |  | [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**is_featured** | **boolean** | boolean indicator of whether the product group is being featured or not | [optional] [default to false]
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [default to undefined]
**feed_id** | **string** | Catalog Feed id pertaining to the catalog product group. | [default to undefined]

## Example

```typescript
import { MultipleProductGroupsInner } from './api';

const instance: MultipleProductGroupsInner = {
    name,
    description,
    is_featured,
    filters,
    feed_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
