-module(openapi_respond_to_invite_result_item).

-include("openapi.hrl").

-export([openapi_respond_to_invite_result_item/0]).

-export([openapi_respond_to_invite_result_item/1]).

-export_type([openapi_respond_to_invite_result_item/0]).

-type openapi_respond_to_invite_result_item() ::
  [ {'exception', openapi_invite_exception_response:openapi_invite_exception_response() }
  | {'invite', openapi_base_invite_data_response:openapi_base_invite_data_response() }
  ].


openapi_respond_to_invite_result_item() ->
    openapi_respond_to_invite_result_item([]).

openapi_respond_to_invite_result_item(Fields) ->
  Default = [ {'exception', openapi_invite_exception_response:openapi_invite_exception_response() }
            , {'invite', openapi_base_invite_data_response:openapi_base_invite_data_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

