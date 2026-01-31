# CatalogsUpdatableHotelAttributes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | The hotel\&#39;s name. | [optional] [default to undefined]
**link** | **string** | Link to the product page | [optional] [default to undefined]
**description** | **string** | Brief description of the hotel. | [optional] [default to undefined]
**brand** | **string** | The brand to which this hotel belongs to. | [optional] [default to undefined]
**latitude** | **number** | Latitude of the hotel. | [optional] [default to undefined]
**longitude** | **number** | Longitude of the hotel. | [optional] [default to undefined]
**neighborhood** | **Array&lt;string&gt;** | A list of neighborhoods where the hotel is located | [optional] [default to undefined]
**address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) |  | [optional] [default to undefined]
**custom_label_0** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**custom_label_1** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**custom_label_2** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**custom_label_3** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**custom_label_4** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**category** | **string** | The type of property. The category can be any type of internal description desired. | [optional] [default to undefined]
**base_price** | **string** | Base price of the hotel room per night followed by the ISO currency code | [optional] [default to undefined]
**sale_price** | **string** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] [default to undefined]
**guest_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CatalogsUpdatableHotelAttributes } from './api';

const instance: CatalogsUpdatableHotelAttributes = {
    name,
    link,
    description,
    brand,
    latitude,
    longitude,
    neighborhood,
    address,
    custom_label_0,
    custom_label_1,
    custom_label_2,
    custom_label_3,
    custom_label_4,
    category,
    base_price,
    sale_price,
    guest_ratings,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
