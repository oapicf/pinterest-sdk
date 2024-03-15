-module(openapi_keyword_metrics_response).

-export([encode/1]).

-export_type([openapi_keyword_metrics_response/0]).

-type openapi_keyword_metrics_response() ::
    #{ 'keyword' => binary(),
       'metrics' => openapi_keyword_metrics:openapi_keyword_metrics()
     }.

encode(#{ 'keyword' := Keyword,
          'metrics' := Metrics
        }) ->
    #{ 'keyword' => Keyword,
       'metrics' => Metrics
     }.
