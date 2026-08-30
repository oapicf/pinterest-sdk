-module(openapi_cancel_invites_response).

-include("openapi.hrl").

-export([openapi_cancel_invites_response/0]).

-export([openapi_cancel_invites_response/1]).

-export_type([openapi_cancel_invites_response/0]).

-type openapi_cancel_invites_response() ::
  [ {'items', list(openapi_cancel_invite_result_item:openapi_cancel_invite_result_item()) }
  ].


openapi_cancel_invites_response() ->
    openapi_cancel_invites_response([]).

openapi_cancel_invites_response(Fields) ->
  Default = [ {'items', list(openapi_cancel_invite_result_item:openapi_cancel_invite_result_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

