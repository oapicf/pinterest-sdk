# PinterestSdkClient::AdvancedAuctionItemsSubmitUpsertRecord

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  |  |
| **item_id** | **String** | The catalog retail item id in the merchant namespace |  |
| **language** | [**Language**](Language.md) |  |  |
| **bid_options** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  |  |
| **errors** | [**Array&lt;AdvancedAuctionOperationError&gt;**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] |
| **update_mask** | [**Array&lt;UpdateMaskBidOptionField&gt;**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionItemsSubmitUpsertRecord.new(
  country: null,
  item_id: DS0294-M,
  language: null,
  bid_options: null,
  errors: null,
  update_mask: [&quot;BID&quot;,&quot;APP_TYPE_BID_MULTIPLIER_SET&quot;]
)
```

