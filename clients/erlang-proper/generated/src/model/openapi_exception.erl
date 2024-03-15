-module(openapi_exception).

-include("openapi.hrl").

-export([openapi_exception/0]).

-export([openapi_exception/1]).

-export_type([openapi_exception/0]).

-type openapi_exception() ::
  [ {'code', integer() }
  | {'message', binary() }
  ].


openapi_exception() ->
    openapi_exception([]).

openapi_exception(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

