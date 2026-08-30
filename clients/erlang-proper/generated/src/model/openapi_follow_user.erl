-module(openapi_follow_user).

-include("openapi.hrl").

-export([openapi_follow_user/0]).

-export([openapi_follow_user/1]).

-export_type([openapi_follow_user/0]).

-type openapi_follow_user() ::
  [ {'type', binary() }
  | {'username', binary() }
  ].


openapi_follow_user() ->
    openapi_follow_user([]).

openapi_follow_user(Fields) ->
  Default = [ {'type', binary() }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

