# PinterestSdkClient::QualityComponents

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **advertiser_external_id** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) |  | [optional] |
| **click_id_epik** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) |  | [optional] |
| **external_event_id** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) | Dedup components. | [optional] |
| **hashed_email** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) | User matching identifiers. | [optional] |
| **hashed_maid** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) |  | [optional] |
| **ip_address** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) |  | [optional] |
| **order_id** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) |  | [optional] |
| **order_value** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) |  | [optional] |
| **product_id** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) | Product/event metadata. | [optional] |
| **source_url** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) |  | [optional] |
| **user_agent** | [**Hash&lt;String, QualityComponentDetails&gt;**](QualityComponentDetails.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::QualityComponents.new(
  advertiser_external_id: null,
  click_id_epik: null,
  external_event_id: null,
  hashed_email: null,
  hashed_maid: null,
  ip_address: null,
  order_id: null,
  order_value: null,
  product_id: null,
  source_url: null,
  user_agent: null
)
```

