-module(openapi_catalogs_report_feed_ingestion_stats).

-export([encode/1]).

-export_type([openapi_catalogs_report_feed_ingestion_stats/0]).

-type openapi_catalogs_report_feed_ingestion_stats() ::
    #{ 'report_type' => binary(),
       'catalog_id' => binary(),
       'code' => integer(),
       'code_label' => binary(),
       'message' => binary(),
       'occurrences' => integer(),
       'severity' => binary()
     }.

encode(#{ 'report_type' := ReportType,
          'catalog_id' := CatalogId,
          'code' := Code,
          'code_label' := CodeLabel,
          'message' := Message,
          'occurrences' := Occurrences,
          'severity' := Severity
        }) ->
    #{ 'report_type' => ReportType,
       'catalog_id' => CatalogId,
       'code' => Code,
       'code_label' => CodeLabel,
       'message' => Message,
       'occurrences' => Occurrences,
       'severity' => Severity
     }.
