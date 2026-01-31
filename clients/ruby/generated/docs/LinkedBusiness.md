# PinterestSdkClient::LinkedBusiness

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image_large_url** | **String** | image_large_url | [optional] |
| **image_medium_url** | **String** | image_medium_url | [optional] |
| **image_small_url** | **String** | image_small_url | [optional] |
| **image_xlarge_url** | **String** | image_xlarge_url | [optional] |
| **username** | **String** | Username | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LinkedBusiness.new(
  image_large_url: https://www.example.com/dj23454f53dfk2324.jpg,
  image_medium_url: https://www.example.com/dj23454f53dfk2324.jpg,
  image_small_url: https://www.example.com/dj23454f53dfk2324.jpg,
  image_xlarge_url: https://www.example.com/dj23454f53dfk2324.jpg,
  username: username
)
```

