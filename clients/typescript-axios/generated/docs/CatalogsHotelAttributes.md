# CatalogsHotelAttributes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address | [optional] [default to undefined]
**base_price** | **string** | Base price of the hotel room per night followed by the ISO currency code | [optional] [default to undefined]
**brand** | **string** | The brand to which this hotel belongs to. | [optional] [default to undefined]
**category** | **string** | The type of property. The category can be any type of internal description desired. | [optional] [default to undefined]
**custom_label_0** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**custom_label_1** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**custom_label_2** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**custom_label_3** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**custom_label_4** | **string** | Custom grouping of hotels | [optional] [default to undefined]
**description** | **string** | Brief description of the hotel. | [optional] [default to undefined]
**guest_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties | [optional] [default to undefined]
**latitude** | **number** | Latitude of the hotel. | [optional] [default to undefined]
**link** | **string** | Link to the product page | [optional] [default to undefined]
**longitude** | **number** | Longitude of the hotel. | [optional] [default to undefined]
**name** | **string** | The hotel\&#39;s name. | [optional] [default to undefined]
**neighborhood** | **Array&lt;string&gt;** | A list of neighborhoods where the hotel is located | [optional] [default to undefined]
**sale_price** | **string** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] [default to undefined]
**additional_image_link** | **Array&lt;string&gt;** | &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional] [default to undefined]
**ai_disclosures** | [**Array&lt;CatalogsAiContentDisclosure&gt;**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional] [default to undefined]
**main_image** | [**CatalogsHotelMainImage**](CatalogsHotelMainImage.md) | The main hotel image | [optional] [default to undefined]

## Example

```typescript
import { CatalogsHotelAttributes } from './api';

const instance: CatalogsHotelAttributes = {
    address,
    base_price,
    brand,
    category,
    custom_label_0,
    custom_label_1,
    custom_label_2,
    custom_label_3,
    custom_label_4,
    description,
    guest_ratings,
    latitude,
    link,
    longitude,
    name,
    neighborhood,
    sale_price,
    additional_image_link,
    ai_disclosures,
    main_image,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
