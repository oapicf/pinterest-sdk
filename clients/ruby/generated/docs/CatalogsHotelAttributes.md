# PinterestSdkClient::CatalogsHotelAttributes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) |  | [optional] |
| **base_price** | **String** | Base price of the hotel room per night followed by the ISO currency code | [optional] |
| **brand** | **String** | The brand to which this hotel belongs to. | [optional] |
| **category** | **String** | The type of property. The category can be any type of internal description desired. | [optional] |
| **custom_label_0** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_1** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_2** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_3** | **String** | Custom grouping of hotels | [optional] |
| **custom_label_4** | **String** | Custom grouping of hotels | [optional] |
| **description** | **String** | Brief description of the hotel. | [optional] |
| **guest_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  | [optional] |
| **latitude** | **Float** | Latitude of the hotel. | [optional] |
| **link** | **String** | Link to the product page | [optional] |
| **longitude** | **Float** | Longitude of the hotel. | [optional] |
| **name** | **String** | The hotel&#39;s name. | [optional] |
| **neighborhood** | **Array&lt;String&gt;** | A list of neighborhoods where the hotel is located | [optional] |
| **sale_price** | **String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] |
| **additional_image_link** | **Array&lt;String&gt;** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt; | [optional] |
| **main_image** | [**CatalogsHotelAttributesAllOfMainImage**](CatalogsHotelAttributesAllOfMainImage.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelAttributes.new(
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
  sale_price: 90 USD,
  additional_image_link: [&quot;https://scene.example.com/image/image_v2.jpg&quot;,&quot;https://scene.example.com/image/image_v3.jpg&quot;],
  main_image: null
)
```

