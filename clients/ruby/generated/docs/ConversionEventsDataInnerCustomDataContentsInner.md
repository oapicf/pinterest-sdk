# PinterestSdkClient::ConversionEventsDataInnerCustomDataContentsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] |
| **item_price** | **String** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] |
| **quantity** | **Integer** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] |
| **item_name** | **String** | The name of a product. | [optional] |
| **item_category** | **String** | The category of a product. | [optional] |
| **item_brand** | **String** | The brand of a product. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEventsDataInnerCustomDataContentsInner.new(
  id: red-pinterest-shirt-logo-1,
  item_price: 1325.12,
  quantity: 5,
  item_name: pinterest-clothing-shirt,
  item_category: pinterest-entertainment,
  item_brand: pinterest
)
```

