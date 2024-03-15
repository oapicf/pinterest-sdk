

# PinterestTagEventData

Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **Currency** |  |  [optional] |
|**leadType** | **String** | Promotion code. For example, \&quot;Newsletter\&quot;. |  [optional] |
|**lineItems** | [**LineItem**](LineItem.md) |  |  [optional] |
|**orderId** | **String** | Order ID. For example, \&quot;X-151481\&quot;. |  [optional] |
|**orderQuantity** | **Integer** | Order quantity. For example, 1. |  [optional] |
|**pageName** | **String** | Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;. |  [optional] |
|**promoCode** | **String** | Promotion code. For example, \&quot;WINTER10\&quot;. |  [optional] |
|**property** | **String** | Property. For example, \&quot;Athleta\&quot;. |  [optional] |
|**searchQuery** | **String** | Search query string. For example, \&quot;boots\&quot;. |  [optional] |
|**value** | **String** | Product value. For example, \&quot;199.98\&quot; |  [optional] |
|**videoTitle** | **String** | Video title. For example, \&quot;How to style your Parker Boots\&quot;. |  [optional] |



