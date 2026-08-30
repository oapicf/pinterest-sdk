-module(openapi_ad_groups_create_200_response).

-include("openapi.hrl").

-export([openapi_ad_groups_create_200_response/0]).

-export([openapi_ad_groups_create_200_response/1]).

-export_type([openapi_ad_groups_create_200_response/0]).

-type openapi_ad_groups_create_200_response() ::
  [ {'items', list(openapi_ad_groups_create_200_response_items_inner:openapi_ad_groups_create_200_response_items_inner()) }
  ].


openapi_ad_groups_create_200_response() ->
    openapi_ad_groups_create_200_response([]).

openapi_ad_groups_create_200_response(Fields) ->
  Default = [ {'items', list(openapi_ad_groups_create_200_response_items_inner:openapi_ad_groups_create_200_response_items_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

