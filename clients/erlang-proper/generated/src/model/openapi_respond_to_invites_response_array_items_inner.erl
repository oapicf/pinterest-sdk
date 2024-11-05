-module(openapi_respond_to_invites_response_array_items_inner).

-include("openapi.hrl").

-export([openapi_respond_to_invites_response_array_items_inner/0]).

-export([openapi_respond_to_invites_response_array_items_inner/1]).

-export_type([openapi_respond_to_invites_response_array_items_inner/0]).

-type openapi_respond_to_invites_response_array_items_inner() ::
  [ {'exception', openapi_invite_exception_response:openapi_invite_exception_response() }
  | {'invite', openapi_base_invite_data_response:openapi_base_invite_data_response() }
  ].


openapi_respond_to_invites_response_array_items_inner() ->
    openapi_respond_to_invites_response_array_items_inner([]).

openapi_respond_to_invites_response_array_items_inner(Fields) ->
  Default = [ {'exception', openapi_invite_exception_response:openapi_invite_exception_response() }
            , {'invite', openapi_base_invite_data_response:openapi_base_invite_data_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

