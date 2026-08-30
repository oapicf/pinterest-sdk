-module(openapi_cancel_invite_result_item).

-include("openapi.hrl").

-export([openapi_cancel_invite_result_item/0]).

-export([openapi_cancel_invite_result_item/1]).

-export_type([openapi_cancel_invite_result_item/0]).

-type openapi_cancel_invite_result_item() ::
  [ {'exception', openapi_cancel_invite_exception:openapi_cancel_invite_exception() }
  | {'invite', openapi_cancel_invite_result:openapi_cancel_invite_result() }
  ].


openapi_cancel_invite_result_item() ->
    openapi_cancel_invite_result_item([]).

openapi_cancel_invite_result_item(Fields) ->
  Default = [ {'exception', openapi_cancel_invite_exception:openapi_cancel_invite_exception() }
            , {'invite', openapi_cancel_invite_result:openapi_cancel_invite_result() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

