# PinterestSdkClient::CatalogsHotelAddress

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **addr1** | **String** | Primary street address of hotel. | [optional] |
| **city** | **String** | City where the hotel is located. | [optional] |
| **region** | **String** | State, county, province, where the hotel is located. | [optional] |
| **country** | **String** | Country where the hotel is located. | [optional] |
| **postal_code** | **String** | Required for countries with a postal code system. Postal or zip code of the hotel. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelAddress.new(
  addr1: null,
  city: null,
  region: null,
  country: null,
  postal_code: null
)
```

