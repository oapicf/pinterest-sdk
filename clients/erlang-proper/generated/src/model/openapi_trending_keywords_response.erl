-module(openapi_trending_keywords_response).

-include("openapi.hrl").

-export([openapi_trending_keywords_response/0]).

-export([openapi_trending_keywords_response/1]).

-export_type([openapi_trending_keywords_response/0]).

-type openapi_trending_keywords_response() ::
  [ {'trends', list(openapi_trending_keywords_response_trends_inner:openapi_trending_keywords_response_trends_inner()) }
  ].


openapi_trending_keywords_response() ->
    openapi_trending_keywords_response([]).

openapi_trending_keywords_response(Fields) ->
  Default = [ {'trends', list(openapi_trending_keywords_response_trends_inner:openapi_trending_keywords_response_trends_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

