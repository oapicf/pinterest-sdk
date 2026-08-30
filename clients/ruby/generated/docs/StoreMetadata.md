# PinterestSdkClient::StoreMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **geohash** | **String** | Geohash of the store location | [optional] |
| **latitude** | **Float** | Geographic latitude coordinate of the store | [optional] |
| **longitude** | **Float** | Geographic longitude coordinate of the store | [optional] |
| **store_code** | **String** | Merchant provided store code |  |
| **store_id** | **String** | Internal store code |  |
| **store_name** | **String** | Store name | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::StoreMetadata.new(
  geohash: 9q,
  latitude: 37.37695098,
  longitude: -122.032913,
  store_code: store_1,
  store_id: 9070947806573,
  store_name: Store 1 Sunnyvale
)
```

