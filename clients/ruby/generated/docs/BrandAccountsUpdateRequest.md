# PinterestSdkClient::BrandAccountsUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Brand Account name | [optional] |
| **username** | **String** | Brand Account username | [optional] |
| **country** | [**Country**](Country.md) |  | [optional] |
| **about** | **String** | Brand Account about information | [optional] |
| **website** | **String** | Brand Account website | [optional] |
| **profile_image** | [**ImageBase64**](ImageBase64.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BrandAccountsUpdateRequest.new(
  name: Canada Stores,
  username: canada_stores,
  country: null,
  about: Stores in Canada,
  website: https://www.example.com,
  profile_image: null
)
```

