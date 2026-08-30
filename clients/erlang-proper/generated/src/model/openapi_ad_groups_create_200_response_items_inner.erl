-module(openapi_ad_groups_create_200_response_items_inner).

-include("openapi.hrl").

-export([openapi_ad_groups_create_200_response_items_inner/0]).

-export([openapi_ad_groups_create_200_response_items_inner/1]).

-export_type([openapi_ad_groups_create_200_response_items_inner/0]).

-type openapi_ad_groups_create_200_response_items_inner() ::
  [ {'data', openapi_ad_group:openapi_ad_group() }
  | {'exceptions', list(openapi_pinterest_lib_batch_item_exception:openapi_pinterest_lib_batch_item_exception()) }
  ].


openapi_ad_groups_create_200_response_items_inner() ->
    openapi_ad_groups_create_200_response_items_inner([]).

openapi_ad_groups_create_200_response_items_inner(Fields) ->
  Default = [ {'data', openapi_ad_group:openapi_ad_group() }
            , {'exceptions', list(openapi_pinterest_lib_batch_item_exception:openapi_pinterest_lib_batch_item_exception()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

