-module(openapi_keywords_get_200_response).

-include("openapi.hrl").

-export([openapi_keywords_get_200_response/0]).

-export([openapi_keywords_get_200_response/1]).

-export_type([openapi_keywords_get_200_response/0]).

-type openapi_keywords_get_200_response() ::
  [ {'items', list(openapi_keyword:openapi_keyword()) }
  | {'bookmark', binary() }
  ].


openapi_keywords_get_200_response() ->
    openapi_keywords_get_200_response([]).

openapi_keywords_get_200_response(Fields) ->
  Default = [ {'items', list(openapi_keyword:openapi_keyword()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

