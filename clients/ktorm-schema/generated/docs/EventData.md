
# Table `EventData`
(mapped from: EventData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**currency** | currency | long |  | [**Currency**](Currency.md) | Currency. For example, &#39;USD&#39;. |  [optional] [foreignkey]
**leadType** | lead_type | text |  | **kotlin.String** | Promotion code. For example, &#39;Newsletter&#39;. |  [optional]
**lineItems** | line_items | long |  | [**LineItem**](LineItem.md) |  |  [optional] [foreignkey]
**orderId** | order_id | text |  | **kotlin.String** | Order ID. For example, &#39;X-151481&#39;. |  [optional]
**orderQuantity** | order_quantity | int |  | **kotlin.Int** | Order quantity. For example, 1. |  [optional]
**pageName** | page_name | text |  | **kotlin.String** | Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;. |  [optional]
**promoCode** | promo_code | text |  | **kotlin.String** | Promotion code. For example, &#39;WINTER10&#39;. |  [optional]
**property** | property | text |  | **kotlin.String** | Property. For example, &#39;Athleta&#39;. |  [optional]
**searchQuery** | search_query | text |  | **kotlin.String** | Search query string. For example, &#39;boots&#39;. |  [optional]
**value** | value | text |  | **kotlin.String** | Product value. For example, &#39;199.98&#39;. |  [optional]
**videoTitle** | video_title | text |  | **kotlin.String** | Video title. For example, &#39;How to style your Parker Boots&#39;. |  [optional]













