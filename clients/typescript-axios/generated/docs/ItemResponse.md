# ItemResponse

Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] [default to undefined]
**item_response_kind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [default to undefined]
**pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] [default to undefined]
**hotel_id** | **string** | The catalog hotel id in the merchant namespace | [optional] [default to undefined]
**creative_assets_id** | **string** | The catalog creative assets id in the merchant namespace | [optional] [default to undefined]
**errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | [default to undefined]

## Example

```typescript
import { ItemResponse } from './api';

const instance: ItemResponse = {
    attributes,
    catalog_type,
    item_id,
    item_response_kind,
    pins,
    hotel_id,
    creative_assets_id,
    errors,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
