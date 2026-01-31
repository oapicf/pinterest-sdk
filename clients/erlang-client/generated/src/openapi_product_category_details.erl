-module(openapi_product_category_details).

-export([encode/1]).

-export_type([openapi_product_category_details/0]).

-type openapi_product_category_details() ::
    #{ 'demographics' => openapi_product_categories_demographic:openapi_product_categories_demographic(),
       'has_prediction' := boolean(),
       'metrics_highlights' => openapi_product_categories_metrics_highlights:openapi_product_categories_metrics_highlights(),
       'predicted_time_series' => maps:map(),
       'product_category' := openapi_product_category_enum:openapi_product_category_enum(),
       'related_searches' => list(),
       'time_series' => maps:map()
     }.

encode(#{ 'demographics' := Demographics,
          'has_prediction' := HasPrediction,
          'metrics_highlights' := MetricsHighlights,
          'predicted_time_series' := PredictedTimeSeries,
          'product_category' := ProductCategory,
          'related_searches' := RelatedSearches,
          'time_series' := TimeSeries
        }) ->
    #{ 'demographics' => Demographics,
       'has_prediction' => HasPrediction,
       'metrics_highlights' => MetricsHighlights,
       'predicted_time_series' => PredictedTimeSeries,
       'product_category' => ProductCategory,
       'related_searches' => RelatedSearches,
       'time_series' => TimeSeries
     }.
