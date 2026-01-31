# ItemResponseAnyOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**item_id** | **string** | The catalog retail item id in the merchant namespace | [optional] [default to undefined]
**pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] [default to undefined]
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] [default to undefined]
**hotel_id** | **string** | The catalog hotel id in the merchant namespace | [optional] [default to undefined]
**creative_assets_id** | **string** | The catalog creative assets id in the merchant namespace | [optional] [default to undefined]

## Example

```typescript
import { ItemResponseAnyOf } from './api';

const instance: ItemResponseAnyOf = {
    catalog_type,
    item_id,
    pins,
    attributes,
    hotel_id,
    creative_assets_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
