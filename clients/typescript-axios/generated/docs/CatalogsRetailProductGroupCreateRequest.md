# CatalogsRetailProductGroupCreateRequest

Request object for creating a product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [default to undefined]
**name** | **string** |  | [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [default to undefined]
**catalog_id** | **string** | Catalog id pertaining to the retail product group. | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsRetailProductGroupCreateRequest } from './api';

const instance: CatalogsRetailProductGroupCreateRequest = {
    catalog_type,
    name,
    description,
    filters,
    catalog_id,
    country,
    locale,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
