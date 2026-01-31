# PinterestSdkClient::SSIOInsertionOrderStatus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **creation_time** | **String** | Salesforce insertion order creation time | [optional] |
| **pin_order_id** | **String** | Salesforce order id | [optional] |
| **status** | **String** | Salesforce insertion order status | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOInsertionOrderStatus.new(
  creation_time: 2017-06-21T23:11:11.000Z,
  pin_order_id: 0Q01N0000015hekSAB,
  status: Approved
)
```

