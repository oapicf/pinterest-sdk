-module(openapi_catalogs_retail_available_filter_values).

-export([encode/1]).

-export_type([openapi_catalogs_retail_available_filter_values/0]).

-type openapi_catalogs_retail_available_filter_values() ::
    #{ 'catalog_type' := binary(),
       'filter_values' := openapi_catalogs_retail_filter_values_map:openapi_catalogs_retail_filter_values_map()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'filter_values' := FilterValues
        }) ->
    #{ 'catalog_type' => CatalogType,
       'filter_values' => FilterValues
     }.
