# CatalogsHotelItemResponse

Object describing a hotel record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] [default to undefined]
**catalog_type** | **string** |  | [default to undefined]
**hotel_id** | **string** | The catalog hotel id in the merchant namespace | [optional] [default to undefined]
**item_response_kind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [default to undefined]
**pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] [default to undefined]

## Example

```typescript
import { CatalogsHotelItemResponse } from './api';

const instance: CatalogsHotelItemResponse = {
    attributes,
    catalog_type,
    hotel_id,
    item_response_kind,
    pins,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
