-module(openapi_ad_group_delivery_estimates_keywords_items).

-include("openapi.hrl").

-export([openapi_ad_group_delivery_estimates_keywords_items/0]).

-export([openapi_ad_group_delivery_estimates_keywords_items/1]).

-export_type([openapi_ad_group_delivery_estimates_keywords_items/0]).

-type openapi_ad_group_delivery_estimates_keywords_items() ::
  [ {'match_type', openapi_nullalble_match_type:openapi_nullalble_match_type() }
  | {'value', binary() }
  ].


openapi_ad_group_delivery_estimates_keywords_items() ->
    openapi_ad_group_delivery_estimates_keywords_items([]).

openapi_ad_group_delivery_estimates_keywords_items(Fields) ->
  Default = [ {'match_type', openapi_nullalble_match_type:openapi_nullalble_match_type() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

