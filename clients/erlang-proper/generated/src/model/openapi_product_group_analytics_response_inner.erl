-module(openapi_product_group_analytics_response_inner).

-include("openapi.hrl").

-export([openapi_product_group_analytics_response_inner/0]).

-export([openapi_product_group_analytics_response_inner/1]).

-export_type([openapi_product_group_analytics_response_inner/0]).

-type openapi_product_group_analytics_response_inner() ::
  [ {'PRODUCT_GROUP_ID', binary() }
  | {'DATE', date() }
  ].


openapi_product_group_analytics_response_inner() ->
    openapi_product_group_analytics_response_inner([]).

openapi_product_group_analytics_response_inner(Fields) ->
  Default = [ {'PRODUCT_GROUP_ID', binary() }
            , {'DATE', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

