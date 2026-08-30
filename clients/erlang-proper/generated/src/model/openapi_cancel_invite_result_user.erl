-module(openapi_cancel_invite_result_user).

-include("openapi.hrl").

-export([openapi_cancel_invite_result_user/0]).

-export([openapi_cancel_invite_result_user/1]).

-export_type([openapi_cancel_invite_result_user/0]).

-type openapi_cancel_invite_result_user() ::
  [ {'email', binary() }
  | {'id', binary() }
  | {'username', binary() }
  ].


openapi_cancel_invite_result_user() ->
    openapi_cancel_invite_result_user([]).

openapi_cancel_invite_result_user(Fields) ->
  Default = [ {'email', binary() }
            , {'id', binary(1, 20) }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

