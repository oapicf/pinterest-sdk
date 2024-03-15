-module(openapi_keyword_metrics).

-export([encode/1]).

-export_type([openapi_keyword_metrics/0]).

-type openapi_keyword_metrics() ::
    #{ 'avg_cpc_in_micro_currency' => integer(),
       'keyword_query_volume' => binary()
     }.

encode(#{ 'avg_cpc_in_micro_currency' := AvgCpcInMicroCurrency,
          'keyword_query_volume' := KeywordQueryVolume
        }) ->
    #{ 'avg_cpc_in_micro_currency' => AvgCpcInMicroCurrency,
       'keyword_query_volume' => KeywordQueryVolume
     }.
