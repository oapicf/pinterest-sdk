# CatalogsRetailProductGroupUpdateRequest

Request object for updating a retail product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [optional] [default to undefined]
**name** | **string** |  | [optional] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] [default to undefined]
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsRetailProductGroupUpdateRequest } from './api';

const instance: CatalogsRetailProductGroupUpdateRequest = {
    catalog_type,
    name,
    description,
    filters,
    country,
    locale,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
