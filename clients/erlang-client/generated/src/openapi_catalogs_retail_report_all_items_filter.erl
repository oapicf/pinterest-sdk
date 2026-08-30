-module(openapi_catalogs_retail_report_all_items_filter).

-export([encode/1]).

-export_type([openapi_catalogs_retail_report_all_items_filter/0]).

-type openapi_catalogs_retail_report_all_items_filter() ::
    #{ 'catalog_id' => binary(),
       'product_group_id' => binary(),
       'report_type' := binary()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'product_group_id' := ProductGroupId,
          'report_type' := ReportType
        }) ->
    #{ 'catalog_id' => CatalogId,
       'product_group_id' => ProductGroupId,
       'report_type' => ReportType
     }.
