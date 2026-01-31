-module(openapi_featured_trend).

-include("openapi.hrl").

-export([openapi_featured_trend/0]).

-export([openapi_featured_trend/1]).

-export_type([openapi_featured_trend/0]).

-type openapi_featured_trend() ::
  [ {'interest', openapi_interests_enum:openapi_interests_enum() }
  | {'market', openapi_product_category_region:openapi_product_category_region() }
  | {'trends', list(openapi_trending_topic:openapi_trending_topic()) }
  ].


openapi_featured_trend() ->
    openapi_featured_trend([]).

openapi_featured_trend(Fields) ->
  Default = [ {'interest', openapi_interests_enum:openapi_interests_enum() }
            , {'market', openapi_product_category_region:openapi_product_category_region() }
            , {'trends', list(openapi_trending_topic:openapi_trending_topic()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

