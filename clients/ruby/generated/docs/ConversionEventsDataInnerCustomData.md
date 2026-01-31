# PinterestSdkClient::ConversionEventsDataInnerCustomData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content_brand** | **String** | The brand of the content associated with the event. | [optional] |
| **content_category** | **String** | The category of the content associated with the event. | [optional] |
| **content_ids** | **Array&lt;String&gt;** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] |
| **content_name** | **String** | The name of the page or product associated with the event. | [optional] |
| **contents** | [**Array&lt;ConversionEventsDataInnerCustomDataContentsInner&gt;**](ConversionEventsDataInnerCustomDataContentsInner.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] |
| **currency** | **String** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] |
| **external_measurement_id** | **String** | Only use when instructed. | [optional] |
| **external_measurement_vendor_id** | **Integer** | Only use when instructed. | [optional] |
| **np** | **String** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] |
| **num_items** | **Integer** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] |
| **opt_out_type** | **String** | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;limited data processing&lt;/a&gt; and the developer&#39;s guide for &lt;a href&#x3D;\&quot;/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\&quot; target&#x3D;\&quot;_blank\&quot;&gt;tracking conversion events&lt;/a&gt; for help with using this parameter. | [optional] |
| **order_id** | **String** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] |
| **predicted_ltv** | **String** | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. | [optional] |
| **search_string** | **String** | The search string related to the user conversion event. | [optional] |
| **value** | **String** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEventsDataInnerCustomData.new(
  content_brand: pinterest-brand,
  content_category: shirts,
  content_ids: [&quot;product-id-001&quot;,&quot;product-id-002&quot;],
  content_name: pinterest-themed-clothing,
  contents: [{&quot;id&quot;:&quot;product-id-001&quot;,&quot;item_price&quot;:&quot;14.99&quot;,&quot;quantity&quot;:3,&quot;item_name&quot;:&quot;pinterest-shirt-girl&quot;,&quot;item_category&quot;:&quot;pinterest-clothing-shirts&quot;,&quot;item_brand&quot;:&quot;pinterest&quot;},{&quot;id&quot;:&quot;product-id-002&quot;,&quot;item_price&quot;:&quot;13.71&quot;,&quot;quantity&quot;:2,&quot;item_name&quot;:&quot;pinterest-shirt-men&quot;,&quot;item_category&quot;:&quot;pinterest-clothing-shirts&quot;,&quot;item_brand&quot;:&quot;pinterest&quot;}],
  currency: USD,
  external_measurement_id: rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f,
  external_measurement_vendor_id: 1,
  np: ss-company,
  num_items: 5,
  opt_out_type: LDP,
  order_id: my_order_id,
  predicted_ltv: 2794.82,
  search_string: sample string,
  value: 72.39
)
```

