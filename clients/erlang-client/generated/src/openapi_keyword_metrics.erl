-module(openapi_keyword_metrics).

-export([encode/1]).

-export_type([openapi_keyword_metrics/0]).

-type openapi_keyword_metrics() ::
    #{ 'keyword_query_volume' => binary()
     }.

encode(#{ 'keyword_query_volume' := KeywordQueryVolume
        }) ->
    #{ 'keyword_query_volume' => KeywordQueryVolume
     }.
