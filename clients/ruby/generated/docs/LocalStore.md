# PinterestSdkClient::LocalStore

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **address_primary** | **String** | Primary address line of the store. | [optional] |
| **address_secondary** | **String** | Secondary address line of the store. | [optional] |
| **city** | **String** | City where the store is located. | [optional] |
| **country** | [**Country**](Country.md) | Country code where the store is located. |  |
| **created_at** | **Time** | Creation timestamp | [readonly] |
| **id** | **String** | The ID of the local store. |  |
| **latitude** | **Float** | Geographic latitude coordinate of the store. | [optional] |
| **longitude** | **Float** | Geographic longitude coordinate of the store. | [optional] |
| **name** | **String** | The name of the local store. |  |
| **postal_code** | **String** | Postal or ZIP code of the store. | [optional] |
| **region** | **String** | State or region code where the store is located. | [optional] |
| **store_code** | **String** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. |  |
| **updated_at** | **Time** | Last update timestamp | [readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LocalStore.new(
  address_primary: 123 Johnson St,
  address_secondary: Suite 100,
  city: Sunnyvale,
  country: null,
  created_at: 2022-03-14T15:15:22Z,
  id: 1234567890,
  latitude: -30.21,
  longitude: 50.45,
  name: Sunnyvale Store,
  postal_code: 94043,
  region: CA,
  store_code: store_1,
  updated_at: 2022-03-14T15:16:34Z
)
```

