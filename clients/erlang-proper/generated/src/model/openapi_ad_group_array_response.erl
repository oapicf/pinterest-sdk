-module(openapi_ad_group_array_response).

-include("openapi.hrl").

-export([openapi_ad_group_array_response/0]).

-export([openapi_ad_group_array_response/1]).

-export_type([openapi_ad_group_array_response/0]).

-type openapi_ad_group_array_response() ::
  [ {'items', list(openapi_ad_group_array_response_element:openapi_ad_group_array_response_element()) }
  ].


openapi_ad_group_array_response() ->
    openapi_ad_group_array_response([]).

openapi_ad_group_array_response(Fields) ->
  Default = [ {'items', list(openapi_ad_group_array_response_element:openapi_ad_group_array_response_element()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

