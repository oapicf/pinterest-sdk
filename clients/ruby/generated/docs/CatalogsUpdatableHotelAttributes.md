# PinterestSdkClient::CatalogsUpdatableHotelAttributes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address | [optional] |
| **base_price** | **String** | Base price of the hotel room per night followed by the ISO currency code | [optional] |
| **brand** | **String** | The brand to which this hotel belongs to. | [optional] |
| **category** | **String** | The type of property. The category can be any type of internal description desired. | [optional] |
| **custom_label_0** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_1** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_2** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_3** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_4** | **String** | Custom grouping of hotels | [optional] |
| **description** | **String** | Brief description of the hotel. | [optional] |
| **guest_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties | [optional] |
| **latitude** | **Float** | Latitude of the hotel. | [optional] |
| **link** | **String** | Link to the product page | [optional] |
| **longitude** | **Float** | Longitude of the hotel. | [optional] |
| **name** | **String** | The hotel&#39;s name. | [optional] |
| **neighborhood** | **Array&lt;String&gt;** | A list of neighborhoods where the hotel is located | [optional] |
| **sale_price** | **String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsUpdatableHotelAttributes.new(
  address: null,
  base_price: 100 USD,
  brand: null,
  category: null,
  custom_label_0: null,
  custom_label_1: null,
  custom_label_2: null,
  custom_label_3: null,
  custom_label_4: null,
  description: null,
  guest_ratings: null,
  latitude: null,
  link: null,
  longitude: null,
  name: null,
  neighborhood: null,
  sale_price: 90 USD
)
```

