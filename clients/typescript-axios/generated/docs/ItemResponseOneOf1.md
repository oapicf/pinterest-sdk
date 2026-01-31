# ItemResponseOneOf1

Error item response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) |  | [default to undefined]
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] [default to undefined]
**hotel_id** | **string** | The catalog hotel id in the merchant namespace | [optional] [default to undefined]
**creative_assets_id** | **string** | The catalog creative assets id in the merchant namespace | [optional] [default to undefined]

## Example

```typescript
import { ItemResponseOneOf1 } from './api';

const instance: ItemResponseOneOf1 = {
    catalog_type,
    errors,
    item_id,
    hotel_id,
    creative_assets_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
