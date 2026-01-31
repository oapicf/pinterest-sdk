# CatalogsHotelBatchRequest

Request object to update catalogs hotel items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**items** | [**Array&lt;CatalogsHotelBatchItem&gt;**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | [default to undefined]
**language** | **string** | We recommend using the CatalogsLocale values. | [default to undefined]

## Example

```typescript
import { CatalogsHotelBatchRequest } from './api';

const instance: CatalogsHotelBatchRequest = {
    catalog_id,
    catalog_type,
    country,
    items,
    language,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
