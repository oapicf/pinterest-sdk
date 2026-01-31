-module(openapi_inner_product_categories_metrics_highlights).

-export([encode/1]).

-export_type([openapi_inner_product_categories_metrics_highlights/0]).

-type openapi_inner_product_categories_metrics_highlights() ::
    #{ 'pct_change_mom' := integer()
     }.

encode(#{ 'pct_change_mom' := PctChangeMom
        }) ->
    #{ 'pct_change_mom' => PctChangeMom
     }.
