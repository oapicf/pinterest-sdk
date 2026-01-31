-module(openapi_trending_product_category).

-export([encode/1]).

-export_type([openapi_trending_product_category/0]).

-type openapi_trending_product_category() ::
    #{ 'engagement_type' := openapi_product_categories_engagement_type:openapi_product_categories_engagement_type(),
       'pct_change_mom' := integer(),
       'percent_relative_volume' := integer(),
       'product_category' := binary(),
       'verticals' => list()
     }.

encode(#{ 'engagement_type' := EngagementType,
          'pct_change_mom' := PctChangeMom,
          'percent_relative_volume' := PercentRelativeVolume,
          'product_category' := ProductCategory,
          'verticals' := Verticals
        }) ->
    #{ 'engagement_type' => EngagementType,
       'pct_change_mom' => PctChangeMom,
       'percent_relative_volume' => PercentRelativeVolume,
       'product_category' => ProductCategory,
       'verticals' => Verticals
     }.
