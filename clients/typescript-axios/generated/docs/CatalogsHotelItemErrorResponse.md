# CatalogsHotelItemErrorResponse

Object describing a hotel item error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [default to undefined]
**hotel_id** | **string** | The catalog hotel id in the merchant namespace | [optional] [default to undefined]
**errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] [default to undefined]

## Example

```typescript
import { CatalogsHotelItemErrorResponse } from './api';

const instance: CatalogsHotelItemErrorResponse = {
    catalog_type,
    hotel_id,
    errors,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
