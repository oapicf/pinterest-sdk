-module(openapi_catalogs_report_all_items_filter).

-export([encode/1]).

-export_type([openapi_catalogs_report_all_items_filter/0]).

-type openapi_catalogs_report_all_items_filter() ::
    #{ 'catalog_id' => binary(),
       'report_type' := binary()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'report_type' := ReportType
        }) ->
    #{ 'catalog_id' => CatalogId,
       'report_type' => ReportType
     }.
