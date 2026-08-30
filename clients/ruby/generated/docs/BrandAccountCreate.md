# PinterestSdkClient::BrandAccountCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **about** | **String** | Brand Account about information | [optional] |
| **country** | [**Country**](Country.md) |  |  |
| **name** | **String** | Brand Account name |  |
| **profile_image** | [**BrandAccountProfileImage**](BrandAccountProfileImage.md) |  | [optional] |
| **username** | **String** | Brand Account username |  |
| **website** | **String** | Brand Account website | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BrandAccountCreate.new(
  about: null,
  country: null,
  name: null,
  profile_image: null,
  username: null,
  website: null
)
```

