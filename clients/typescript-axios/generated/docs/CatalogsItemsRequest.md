# CatalogsItemsRequest

Request object of catalogs items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]
**filters** | [**CatalogsItemsPostFilters**](CatalogsItemsPostFilters.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsItemsRequest } from './api';

const instance: CatalogsItemsRequest = {
    country,
    language,
    filters,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
