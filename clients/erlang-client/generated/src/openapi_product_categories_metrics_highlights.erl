-module(openapi_product_categories_metrics_highlights).

-export([encode/1]).

-export_type([openapi_product_categories_metrics_highlights/0]).

-type openapi_product_categories_metrics_highlights() ::
    #{ 'engagement' => openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights(),
       'outbound_clicks' => openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights(),
       'pin_saves' => openapi_inner_product_categories_metrics_highlights:openapi_inner_product_categories_metrics_highlights()
     }.

encode(#{ 'engagement' := Engagement,
          'outbound_clicks' := OutboundClicks,
          'pin_saves' := PinSaves
        }) ->
    #{ 'engagement' => Engagement,
       'outbound_clicks' => OutboundClicks,
       'pin_saves' => PinSaves
     }.
