-module(openapi_pinterest_lib_status204).

-include("openapi.hrl").

-export([openapi_pinterest_lib_status204/0]).

-export([openapi_pinterest_lib_status204/1]).

-export_type([openapi_pinterest_lib_status204/0]).

-type openapi_pinterest_lib_status204() ::
  [ {'statusCode', integer() }
  ].


openapi_pinterest_lib_status204() ->
    openapi_pinterest_lib_status204([]).

openapi_pinterest_lib_status204(Fields) ->
  Default = [ {'statusCode', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

