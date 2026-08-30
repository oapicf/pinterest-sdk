-module(openapi_cancel_invite_result).

-include("openapi.hrl").

-export([openapi_cancel_invite_result/0]).

-export([openapi_cancel_invite_result/1]).

-export_type([openapi_cancel_invite_result/0]).

-type openapi_cancel_invite_result() ::
  [ {'id', binary() }
  | {'invite_data', openapi_invite_data_response:openapi_invite_data_response() }
  | {'is_received_invite', boolean() }
  | {'user', openapi_cancel_invite_result_user:openapi_cancel_invite_result_user() }
  ].


openapi_cancel_invite_result() ->
    openapi_cancel_invite_result([]).

openapi_cancel_invite_result(Fields) ->
  Default = [ {'id', binary() }
            , {'invite_data', openapi_invite_data_response:openapi_invite_data_response() }
            , {'is_received_invite', boolean() }
            , {'user', openapi_cancel_invite_result_user:openapi_cancel_invite_result_user() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

