# CatalogsUpdateHotelItem

Object describing an hotel item batch record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hotel_id** | **string** | The catalog hotel item id in the merchant namespace | [default to undefined]
**operation** | **string** |  | [default to undefined]
**attributes** | [**CatalogsUpdatableHotelAttributes**](CatalogsUpdatableHotelAttributes.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsUpdateHotelItem } from './api';

const instance: CatalogsUpdateHotelItem = {
    hotel_id,
    operation,
    attributes,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
