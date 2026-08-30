-module(openapi_cancel_invite_exception).

-include("openapi.hrl").

-export([openapi_cancel_invite_exception/0]).

-export([openapi_cancel_invite_exception/1]).

-export_type([openapi_cancel_invite_exception/0]).

-type openapi_cancel_invite_exception() ::
  [ {'invite_id', binary() }
  | {'message', binary() }
  ].


openapi_cancel_invite_exception() ->
    openapi_cancel_invite_exception([]).

openapi_cancel_invite_exception(Fields) ->
  Default = [ {'invite_id', binary() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

