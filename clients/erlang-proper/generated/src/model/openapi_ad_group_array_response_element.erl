-module(openapi_ad_group_array_response_element).

-include("openapi.hrl").

-export([openapi_ad_group_array_response_element/0]).

-export([openapi_ad_group_array_response_element/1]).

-export_type([openapi_ad_group_array_response_element/0]).

-type openapi_ad_group_array_response_element() ::
  [ {'data', openapi_ad_group_response:openapi_ad_group_response() }
  | {'exceptions', list(openapi_exception:openapi_exception()) }
  ].


openapi_ad_group_array_response_element() ->
    openapi_ad_group_array_response_element([]).

openapi_ad_group_array_response_element(Fields) ->
  Default = [ {'data', openapi_ad_group_response:openapi_ad_group_response() }
            , {'exceptions', list(openapi_exception:openapi_exception()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

