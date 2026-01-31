-module(openapi_user_summary).

-include("openapi.hrl").

-export([openapi_user_summary/0]).

-export([openapi_user_summary/1]).

-export_type([openapi_user_summary/0]).

-type openapi_user_summary() ::
  [ {'type', binary() }
  | {'username', binary() }
  ].


openapi_user_summary() ->
    openapi_user_summary([]).

openapi_user_summary(Fields) ->
  Default = [ {'type', binary() }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

