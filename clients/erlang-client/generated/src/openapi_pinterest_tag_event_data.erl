-module(openapi_pinterest_tag_event_data).

-export([encode/1]).

-export_type([openapi_pinterest_tag_event_data/0]).

-type openapi_pinterest_tag_event_data() ::
    #{ 'currency' => openapi_currency:openapi_currency(),
       'lead_type' => binary(),
       'line_items' => openapi_line_item:openapi_line_item(),
       'order_id' => binary(),
       'order_quantity' => integer(),
       'page_name' => binary(),
       'promo_code' => binary(),
       'property' => binary(),
       'search_query' => binary(),
       'value' => binary(),
       'video_title' => binary()
     }.

encode(#{ 'currency' := Currency,
          'lead_type' := LeadType,
          'line_items' := LineItems,
          'order_id' := OrderId,
          'order_quantity' := OrderQuantity,
          'page_name' := PageName,
          'promo_code' := PromoCode,
          'property' := Property,
          'search_query' := SearchQuery,
          'value' := Value,
          'video_title' := VideoTitle
        }) ->
    #{ 'currency' => Currency,
       'lead_type' => LeadType,
       'line_items' => LineItems,
       'order_id' => OrderId,
       'order_quantity' => OrderQuantity,
       'page_name' => PageName,
       'promo_code' => PromoCode,
       'property' => Property,
       'search_query' => SearchQuery,
       'value' => Value,
       'video_title' => VideoTitle
     }.
