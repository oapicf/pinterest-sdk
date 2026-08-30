-module(openapi_cancel_invites_request).

-include("openapi.hrl").

-export([openapi_cancel_invites_request/0]).

-export([openapi_cancel_invites_request/1]).

-export_type([openapi_cancel_invites_request/0]).

-type openapi_cancel_invites_request() ::
  [ {'invite_ids', list(binary()) }
  ].


openapi_cancel_invites_request() ->
    openapi_cancel_invites_request([]).

openapi_cancel_invites_request(Fields) ->
  Default = [ {'invite_ids', list(binary(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

