-module(openapi_trending_keywords_response).

-export([encode/1]).

-export_type([openapi_trending_keywords_response/0]).

-type openapi_trending_keywords_response() ::
    #{ 'trends' => list()
     }.

encode(#{ 'trends' := Trends
        }) ->
    #{ 'trends' => Trends
     }.
