# PinterestSdkClient::CartingProduct

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **carting_product_id** | **String** | the internal Pinterest carting product id (different from industry product id) |  |
| **display_preferred_retailers_only** | **Boolean** | Whether to display only the preferred retailers for the carting product | [optional] |
| **display_product_price** | **Boolean** | Whether to display the price for the carting product | [optional] |
| **preferred_retailers** | [**Array&lt;CartingRetailer&gt;**](CartingRetailer.md) | A sorted array of preferred retailers for the carting product | [optional] |
| **randomize_preferred_retailers** | **Boolean** | Whether to randomize preferred retailers for the carting product | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CartingProduct.new(
  carting_product_id: null,
  display_preferred_retailers_only: null,
  display_product_price: null,
  preferred_retailers: null,
  randomize_preferred_retailers: null
)
```

