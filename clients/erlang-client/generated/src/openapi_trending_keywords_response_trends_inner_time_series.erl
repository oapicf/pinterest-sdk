-module(openapi_trending_keywords_response_trends_inner_time_series).

-export([encode/1]).

-export_type([openapi_trending_keywords_response_trends_inner_time_series/0]).

-type openapi_trending_keywords_response_trends_inner_time_series() ::
    #{ 'date' => calendar:date()
     }.

encode(#{ 'date' := Date
        }) ->
    #{ 'date' => Date
     }.
