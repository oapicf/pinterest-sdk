-module(openapi_delete_invites_results_response_array_items_inner).

-include("openapi.hrl").

-export([openapi_delete_invites_results_response_array_items_inner/0]).

-export([openapi_delete_invites_results_response_array_items_inner/1]).

-export_type([openapi_delete_invites_results_response_array_items_inner/0]).

-type openapi_delete_invites_results_response_array_items_inner() ::
  [ {'exception', openapi_delete_invites_results_response_array_items_inner_exception:openapi_delete_invites_results_response_array_items_inner_exception() }
  | {'invite', openapi_base_invite_data_response:openapi_base_invite_data_response() }
  ].


openapi_delete_invites_results_response_array_items_inner() ->
    openapi_delete_invites_results_response_array_items_inner([]).

openapi_delete_invites_results_response_array_items_inner(Fields) ->
  Default = [ {'exception', openapi_delete_invites_results_response_array_items_inner_exception:openapi_delete_invites_results_response_array_items_inner_exception() }
            , {'invite', openapi_base_invite_data_response:openapi_base_invite_data_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

