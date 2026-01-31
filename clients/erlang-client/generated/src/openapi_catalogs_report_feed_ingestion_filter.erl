-module(openapi_catalogs_report_feed_ingestion_filter).

-export([encode/1]).

-export_type([openapi_catalogs_report_feed_ingestion_filter/0]).

-type openapi_catalogs_report_feed_ingestion_filter() ::
    #{ 'feed_id' := binary(),
       'processing_result_id' => binary(),
       'report_type' := binary()
     }.

encode(#{ 'feed_id' := FeedId,
          'processing_result_id' := ProcessingResultId,
          'report_type' := ReportType
        }) ->
    #{ 'feed_id' => FeedId,
       'processing_result_id' => ProcessingResultId,
       'report_type' => ReportType
     }.
