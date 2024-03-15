-module(openapi_detailed_error).

-include("openapi.hrl").

-export([openapi_detailed_error/0]).

-export([openapi_detailed_error/1]).

-export_type([openapi_detailed_error/0]).

-type openapi_detailed_error() ::
  [ {'code', integer() }
  | {'message', binary() }
  | {'details', map() }
  ].


openapi_detailed_error() ->
    openapi_detailed_error([]).

openapi_detailed_error(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            , {'details', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

