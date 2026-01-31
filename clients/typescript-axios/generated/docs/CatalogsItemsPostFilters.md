# CatalogsItemsPostFilters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**item_ids** | **Array&lt;string&gt;** |  | [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [default to undefined]
**hotel_ids** | **Array&lt;string&gt;** |  | [default to undefined]
**creative_assets_ids** | **Array&lt;string&gt;** |  | [default to undefined]

## Example

```typescript
import { CatalogsItemsPostFilters } from './api';

const instance: CatalogsItemsPostFilters = {
    catalog_type,
    item_ids,
    catalog_id,
    hotel_ids,
    creative_assets_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
