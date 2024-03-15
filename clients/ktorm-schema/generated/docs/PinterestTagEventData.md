
# Table `PinterestTagEventData`
(mapped from: PinterestTagEventData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**currency** | currency | long |  | [**Currency**](Currency.md) |  |  [optional] [foreignkey]
**leadType** | lead_type | text |  | **kotlin.String** | Promotion code. For example, \&quot;Newsletter\&quot;. |  [optional]
**lineItems** | line_items | long |  | [**LineItem**](LineItem.md) |  |  [optional] [foreignkey]
**orderId** | order_id | text |  | **kotlin.String** | Order ID. For example, \&quot;X-151481\&quot;. |  [optional]
**orderQuantity** | order_quantity | int |  | **kotlin.Int** | Order quantity. For example, 1. |  [optional]
**pageName** | page_name | text |  | **kotlin.String** | Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;. |  [optional]
**promoCode** | promo_code | text |  | **kotlin.String** | Promotion code. For example, \&quot;WINTER10\&quot;. |  [optional]
**property** | property | text |  | **kotlin.String** | Property. For example, \&quot;Athleta\&quot;. |  [optional]
**searchQuery** | search_query | text |  | **kotlin.String** | Search query string. For example, \&quot;boots\&quot;. |  [optional]
**value** | value | text |  | **kotlin.String** | Product value. For example, \&quot;199.98\&quot; |  [optional]
**videoTitle** | video_title | text |  | **kotlin.String** | Video title. For example, \&quot;How to style your Parker Boots\&quot;. |  [optional]













