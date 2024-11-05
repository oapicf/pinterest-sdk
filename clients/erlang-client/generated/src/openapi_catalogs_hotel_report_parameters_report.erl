-module(openapi_catalogs_hotel_report_parameters_report).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_report_parameters_report/0]).

-type openapi_catalogs_hotel_report_parameters_report() ::
    #{ 'report_type' => binary(),
       'feed_id' := binary(),
       'processing_result_id' => binary(),
       'catalog_id' => binary()
     }.

encode(#{ 'report_type' := ReportType,
          'feed_id' := FeedId,
          'processing_result_id' := ProcessingResultId,
          'catalog_id' := CatalogId
        }) ->
    #{ 'report_type' => ReportType,
       'feed_id' => FeedId,
       'processing_result_id' => ProcessingResultId,
       'catalog_id' => CatalogId
     }.
