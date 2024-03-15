-module(openapi_keywords_response).

-include("openapi.hrl").

-export([openapi_keywords_response/0]).

-export([openapi_keywords_response/1]).

-export_type([openapi_keywords_response/0]).

-type openapi_keywords_response() ::
  [ {'errors', list(openapi_keyword_error:openapi_keyword_error()) }
  | {'keywords', list(openapi_keyword:openapi_keyword()) }
  ].


openapi_keywords_response() ->
    openapi_keywords_response([]).

openapi_keywords_response(Fields) ->
  Default = [ {'errors', list(openapi_keyword_error:openapi_keyword_error()) }
            , {'keywords', list(openapi_keyword:openapi_keyword()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

