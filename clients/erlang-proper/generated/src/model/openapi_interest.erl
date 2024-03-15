-module(openapi_interest).

-include("openapi.hrl").

-export([openapi_interest/0]).

-export([openapi_interest/1]).

-export_type([openapi_interest/0]).

-type openapi_interest() ::
  [ {'canonical_url', binary() }
  | {'id', binary() }
  | {'key', binary() }
  | {'name', binary() }
  ].


openapi_interest() ->
    openapi_interest([]).

openapi_interest(Fields) ->
  Default = [ {'canonical_url', binary() }
            , {'id', binary() }
            , {'key', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

