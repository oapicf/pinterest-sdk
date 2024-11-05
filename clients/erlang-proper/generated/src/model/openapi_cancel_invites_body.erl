-module(openapi_cancel_invites_body).

-include("openapi.hrl").

-export([openapi_cancel_invites_body/0]).

-export([openapi_cancel_invites_body/1]).

-export_type([openapi_cancel_invites_body/0]).

-type openapi_cancel_invites_body() ::
  [ {'invite_ids', list(binary()) }
  ].


openapi_cancel_invites_body() ->
    openapi_cancel_invites_body([]).

openapi_cancel_invites_body(Fields) ->
  Default = [ {'invite_ids', list(binary(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

