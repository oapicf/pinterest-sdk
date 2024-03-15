-module(openapi_keywords_metrics_array_response).

-export([encode/1]).

-export_type([openapi_keywords_metrics_array_response/0]).

-type openapi_keywords_metrics_array_response() ::
    #{ 'data' => list()
     }.

encode(#{ 'data' := Data
        }) ->
    #{ 'data' => Data
     }.
