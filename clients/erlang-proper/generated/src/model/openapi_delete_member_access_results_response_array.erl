-module(openapi_delete_member_access_results_response_array).

-include("openapi.hrl").

-export([openapi_delete_member_access_results_response_array/0]).

-export([openapi_delete_member_access_results_response_array/1]).

-export_type([openapi_delete_member_access_results_response_array/0]).

-type openapi_delete_member_access_results_response_array() ::
  [ {'items', list(openapi_delete_member_access_result:openapi_delete_member_access_result()) }
  ].


openapi_delete_member_access_results_response_array() ->
    openapi_delete_member_access_results_response_array([]).

openapi_delete_member_access_results_response_array(Fields) ->
  Default = [ {'items', list(openapi_delete_member_access_result:openapi_delete_member_access_result()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

