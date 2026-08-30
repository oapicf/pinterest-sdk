-module(openapi_catalogs_retail_report_stats_parameters_report).

-export([encode/1]).

-export_type([openapi_catalogs_retail_report_stats_parameters_report/0]).

-type openapi_catalogs_retail_report_stats_parameters_report() ::
    #{ 'feed_id' := binary(),
       'processing_result_id' => binary(),
       'report_type' := binary(),
       'catalog_id' => binary()
     }.

encode(#{ 'feed_id' := FeedId,
          'processing_result_id' := ProcessingResultId,
          'report_type' := ReportType,
          'catalog_id' := CatalogId
        }) ->
    #{ 'feed_id' => FeedId,
       'processing_result_id' => ProcessingResultId,
       'report_type' => ReportType,
       'catalog_id' => CatalogId
     }.
