-module(openapi_reports_stats_parameters_parameter).

-export([encode/1]).

-export_type([openapi_reports_stats_parameters_parameter/0]).

-type openapi_reports_stats_parameters_parameter() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'report' := openapi_catalogs_hotel_report_stats_parameters_report:openapi_catalogs_hotel_report_stats_parameters_report()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'report' := Report
        }) ->
    #{ 'catalog_type' => CatalogType,
       'report' => Report
     }.
