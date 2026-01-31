-module(openapi_catalogs_report_feed_ingestion_stats).

-export([encode/1]).

-export_type([openapi_catalogs_report_feed_ingestion_stats/0]).

-type openapi_catalogs_report_feed_ingestion_stats() ::
    #{ 'catalog_id' => binary(),
       'code' => integer(),
       'code_label' => binary(),
       'message' => binary(),
       'occurrences' => integer(),
       'report_type' => binary(),
       'severity' => binary()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'code' := Code,
          'code_label' := CodeLabel,
          'message' := Message,
          'occurrences' := Occurrences,
          'report_type' := ReportType,
          'severity' := Severity
        }) ->
    #{ 'catalog_id' => CatalogId,
       'code' => Code,
       'code_label' => CodeLabel,
       'message' => Message,
       'occurrences' => Occurrences,
       'report_type' => ReportType,
       'severity' => Severity
     }.
