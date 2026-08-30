-module(openapi_product_group_analytics_items).

-include("openapi.hrl").

-export([openapi_product_group_analytics_items/0]).

-export([openapi_product_group_analytics_items/1]).

-export_type([openapi_product_group_analytics_items/0]).

-type openapi_product_group_analytics_items() ::
  [ {'DATE', date() }
  | {'PRODUCT_GROUP_ID', binary() }
  ].


openapi_product_group_analytics_items() ->
    openapi_product_group_analytics_items([]).

openapi_product_group_analytics_items(Fields) ->
  Default = [ {'DATE', date() }
            , {'PRODUCT_GROUP_ID', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

