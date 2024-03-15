-module(openapi_keyword_error).

-include("openapi.hrl").

-export([openapi_keyword_error/0]).

-export([openapi_keyword_error/1]).

-export_type([openapi_keyword_error/0]).

-type openapi_keyword_error() ::
  [ {'data', openapi_keyword:openapi_keyword() }
  | {'error_messages', list(binary()) }
  ].


openapi_keyword_error() ->
    openapi_keyword_error([]).

openapi_keyword_error(Fields) ->
  Default = [ {'data', openapi_keyword:openapi_keyword() }
            , {'error_messages', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

