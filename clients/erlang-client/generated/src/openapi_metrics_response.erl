-module(openapi_metrics_response).

-export([encode/1]).

-export_type([openapi_metrics_response/0]).

-type openapi_metrics_response() ::
    #{ 'data' => list()
     }.

encode(#{ 'data' := Data
        }) ->
    #{ 'data' => Data
     }.
