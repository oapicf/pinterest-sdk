-module(openapi_pinterest_lib_error).

-include("openapi.hrl").

-export([openapi_pinterest_lib_error/0]).

-export([openapi_pinterest_lib_error/1]).

-export_type([openapi_pinterest_lib_error/0]).

-type openapi_pinterest_lib_error() ::
  [ {'code', integer() }
  | {'message', binary() }
  ].


openapi_pinterest_lib_error() ->
    openapi_pinterest_lib_error([]).

openapi_pinterest_lib_error(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

