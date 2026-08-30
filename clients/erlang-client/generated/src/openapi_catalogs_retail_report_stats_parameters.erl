-module(openapi_catalogs_retail_report_stats_parameters).

-export([encode/1]).

-export_type([openapi_catalogs_retail_report_stats_parameters/0]).

-type openapi_catalogs_retail_report_stats_parameters() ::
    #{ 'catalog_type' := binary(),
       'report' := openapi_catalogs_retail_report_stats_parameters_report:openapi_catalogs_retail_report_stats_parameters_report()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'report' := Report
        }) ->
    #{ 'catalog_type' => CatalogType,
       'report' => Report
     }.
