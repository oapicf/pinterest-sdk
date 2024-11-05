-module(openapi_update_member_results_response_array).

-include("openapi.hrl").

-export([openapi_update_member_results_response_array/0]).

-export([openapi_update_member_results_response_array/1]).

-export_type([openapi_update_member_results_response_array/0]).

-type openapi_update_member_results_response_array() ::
  [ {'items', list(openapi_update_member_result:openapi_update_member_result()) }
  ].


openapi_update_member_results_response_array() ->
    openapi_update_member_results_response_array([]).

openapi_update_member_results_response_array(Fields) ->
  Default = [ {'items', list(openapi_update_member_result:openapi_update_member_result()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

