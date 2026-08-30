# CatalogsRetailProductGroupCreateRequest

Request object for creating a product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog ID pertaining to the product group. | [default to undefined]
**catalog_type** | **string** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [default to undefined]
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [default to undefined]
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] [default to undefined]
**name** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsRetailProductGroupCreateRequest } from './api';

const instance: CatalogsRetailProductGroupCreateRequest = {
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
