# PinterestSdkClient::SSIOInsertionOrderStatusResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_order_id** | **String** | Salesforce order id | [optional] |
| **status** | **String** | Salesforce insertion order status | [optional] |
| **creation_time** | **String** | Salesforce insertion order creation time | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOInsertionOrderStatusResponse.new(
  pin_order_id: 0Q01N0000015hekSAB,
  status: Approved,
  creation_time: 2017-06-21T23:11:11.000Z
)
```

