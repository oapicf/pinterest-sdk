# PinterestSdkClient::BrandAccountUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **about** | **String** | Brand Account about information | [optional] |
| **country** | [**Country**](Country.md) |  | [optional] |
| **name** | **String** | Brand Account name | [optional] |
| **profile_image** | [**BrandAccountProfileImageUpdate**](BrandAccountProfileImageUpdate.md) |  | [optional] |
| **username** | **String** | Brand Account username | [optional] |
| **website** | **String** | Brand Account website | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BrandAccountUpdate.new(
  about: null,
  country: null,
  name: null,
  profile_image: null,
  username: null,
  website: null
)
```

