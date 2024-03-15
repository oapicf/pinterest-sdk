# PinterestSdkClient::CatalogsUpdatableHotelAttributes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The hotel&#39;s name. | [optional] |
| **link** | **String** | Link to the product page | [optional] |
| **description** | **String** | Brief description of the hotel. | [optional] |
| **brand** | **String** | The brand to which this hotel belongs to. | [optional] |
| **latitude** | **Float** | Latitude of the hotel. | [optional] |
| **longitude** | **Float** | Longitude of the hotel. | [optional] |
| **neighborhood** | **Array&lt;String&gt;** | A list of neighborhoods where the hotel is located | [optional] |
| **address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) |  | [optional] |
| **custom_label_0** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_1** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_2** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_3** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_4** | **String** | Custom grouping of hotels | [optional] |
| **category** | **String** | The type of property. The category can be any type of internal description desired. | [optional] |
| **base_price** | **String** | Base price of the hotel room per night followed by the ISO currency code | [optional] |
| **sale_price** | **String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] |
| **guest_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsUpdatableHotelAttributes.new(
  name: null,
  link: null,
  description: null,
  brand: null,
  latitude: null,
  longitude: null,
  neighborhood: null,
  address: null,
  custom_label_0: null,
  custom_label_1: null,
  custom_label_2: null,
  custom_label_3: null,
  custom_label_4: null,
  category: null,
  base_price: 100 USD,
  sale_price: 90 USD,
  guest_ratings: null
)
```

