# PinterestSdkClient::PromotionUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **discount_status** | **String** | Discount status based on the current time and start and end time of discount | [optional] |
| **end_time** | **Integer** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] |
| **external_id** | **String** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] |
| **platform_type** | **String** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] |
| **promotion_code** | **String** | Code that can be used to redeem a promotion. | [optional] |
| **promotion_custom_id** | **String** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] |
| **promotion_title** | **String** | Internal name for the promotion. | [optional] |
| **promotion_type** | [**PromotionType**](PromotionType.md) |  | [optional] |
| **start_time** | **Integer** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] |
| **template_values** | [**Array&lt;PromotionTemplateValue&gt;**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] |
| **id** | **String** | Promotion ID |  |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PromotionUpdateRequest.new(
  discount_status: ACTIVE,
  end_time: 1678003860,
  external_id: abc,
  platform_type: DEFAULT,
  promotion_code: blackfriday10,
  promotion_custom_id: freeshipping_2025,
  promotion_title: Black Friday 10% off,
  promotion_type: null,
  start_time: 1677003860,
  template_values: null,
  id: 7834020347906,
  status: null
)
```

