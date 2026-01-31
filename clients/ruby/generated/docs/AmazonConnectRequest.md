# PinterestSdkClient::AmazonConnectRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **amazon_storefront_id** | **String** | The Amazon storefront id | [optional] |
| **amazon_storefront_name** | **String** | The Amazon storefront name |  |
| **amazon_storefront_url** | **String** | The Amazon storefront url |  |
| **amazon_user_id** | **String** | The Amazon user id | [optional] |
| **is_amazon_account_linked** | **Boolean** | The Amazon account linking status |  |
| **one_time_passcode** | **String** | The one time passcode for Pinterest-initiated linking requests | [optional] |
| **pinterest_user_id** | **String** | The Pinterest user id for Amazon-initiated linking requests | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AmazonConnectRequest.new(
  amazon_storefront_id: null,
  amazon_storefront_name: null,
  amazon_storefront_url: null,
  amazon_user_id: null,
  is_amazon_account_linked: null,
  one_time_passcode: 089aee0d-92d3-4f8f-a947-6dc016d85bf0,
  pinterest_user_id: 902057137772013006
)
```

