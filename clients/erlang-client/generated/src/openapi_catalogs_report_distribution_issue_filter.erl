-module(openapi_catalogs_report_distribution_issue_filter).

-export([encode/1]).

-export_type([openapi_catalogs_report_distribution_issue_filter/0]).

-type openapi_catalogs_report_distribution_issue_filter() ::
    #{ 'report_type' := binary(),
       'catalog_id' => binary()
     }.

encode(#{ 'report_type' := ReportType,
          'catalog_id' := CatalogId
        }) ->
    #{ 'report_type' => ReportType,
       'catalog_id' => CatalogId
     }.
