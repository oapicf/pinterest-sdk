-module(openapi_keywords).

-include("openapi.hrl").

-export([openapi_keywords/0]).

-export([openapi_keywords/1]).

-export_type([openapi_keywords/0]).

-type openapi_keywords() ::
  [ {'errors', list(openapi_keyword_error:openapi_keyword_error()) }
  | {'keywords', list(openapi_keyword:openapi_keyword()) }
  ].


openapi_keywords() ->
    openapi_keywords([]).

openapi_keywords(Fields) ->
  Default = [ {'errors', list(openapi_keyword_error:openapi_keyword_error()) }
            , {'keywords', list(openapi_keyword:openapi_keyword()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

