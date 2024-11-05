-module(openapi_create_invites_results_response_array_items_inner).

-include("openapi.hrl").

-export([openapi_create_invites_results_response_array_items_inner/0]).

-export([openapi_create_invites_results_response_array_items_inner/1]).

-export_type([openapi_create_invites_results_response_array_items_inner/0]).

-type openapi_create_invites_results_response_array_items_inner() ::
  [ {'exception', openapi_invite_exception_response:openapi_invite_exception_response() }
  | {'invite', openapi_create_invites_results_response_array_items_inner_invite:openapi_create_invites_results_response_array_items_inner_invite() }
  ].


openapi_create_invites_results_response_array_items_inner() ->
    openapi_create_invites_results_response_array_items_inner([]).

openapi_create_invites_results_response_array_items_inner(Fields) ->
  Default = [ {'exception', openapi_invite_exception_response:openapi_invite_exception_response() }
            , {'invite', openapi_create_invites_results_response_array_items_inner_invite:openapi_create_invites_results_response_array_items_inner_invite() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

