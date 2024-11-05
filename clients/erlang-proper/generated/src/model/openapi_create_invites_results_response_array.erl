-module(openapi_create_invites_results_response_array).

-include("openapi.hrl").

-export([openapi_create_invites_results_response_array/0]).

-export([openapi_create_invites_results_response_array/1]).

-export_type([openapi_create_invites_results_response_array/0]).

-type openapi_create_invites_results_response_array() ::
  [ {'items', list(openapi_create_invites_results_response_array_items_inner:openapi_create_invites_results_response_array_items_inner()) }
  ].


openapi_create_invites_results_response_array() ->
    openapi_create_invites_results_response_array([]).

openapi_create_invites_results_response_array(Fields) ->
  Default = [ {'items', list(openapi_create_invites_results_response_array_items_inner:openapi_create_invites_results_response_array_items_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

