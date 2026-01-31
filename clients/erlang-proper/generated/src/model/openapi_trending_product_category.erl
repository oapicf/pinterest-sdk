-module(openapi_trending_product_category).

-include("openapi.hrl").

-export([openapi_trending_product_category/0]).

-export([openapi_trending_product_category/1]).

-export_type([openapi_trending_product_category/0]).

-type openapi_trending_product_category() ::
  [ {'engagement_type', openapi_product_categories_engagement_type:openapi_product_categories_engagement_type() }
  | {'pct_change_mom', integer() }
  | {'percent_relative_volume', integer() }
  | {'product_category', binary() }
  | {'verticals', list(openapi_vertical_product_category:openapi_vertical_product_category()) }
  ].


openapi_trending_product_category() ->
    openapi_trending_product_category([]).

openapi_trending_product_category(Fields) ->
  Default = [ {'engagement_type', openapi_product_categories_engagement_type:openapi_product_categories_engagement_type() }
            , {'pct_change_mom', integer() }
            , {'percent_relative_volume', integer() }
            , {'product_category', binary() }
            , {'verticals', list(openapi_vertical_product_category:openapi_vertical_product_category()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

