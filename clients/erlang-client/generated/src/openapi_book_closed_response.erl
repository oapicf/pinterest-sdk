-module(openapi_book_closed_response).

-export([encode/1]).

-export_type([openapi_book_closed_response/0]).

-type openapi_book_closed_response() ::
    #{ 'conversion_metrics_ready' => boolean(),
       'non_conversion_metrics_ready' => boolean()
     }.

encode(#{ 'conversion_metrics_ready' := ConversionMetricsReady,
          'non_conversion_metrics_ready' := NonConversionMetricsReady
        }) ->
    #{ 'conversion_metrics_ready' => ConversionMetricsReady,
       'non_conversion_metrics_ready' => NonConversionMetricsReady
     }.
