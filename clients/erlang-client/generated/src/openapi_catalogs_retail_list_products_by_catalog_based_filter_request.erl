-module(openapi_catalogs_retail_list_products_by_catalog_based_filter_request).

-export([encode/1]).

-export_type([openapi_catalogs_retail_list_products_by_catalog_based_filter_request/0]).

-type openapi_catalogs_retail_list_products_by_catalog_based_filter_request() ::
    #{ 'catalog_id' := binary(),
       'catalog_type' := binary(),
       'country' := openapi_country:openapi_country(),
       'filters' := openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters(),
       'locale' := openapi_catalogs_locale:openapi_catalogs_locale()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'country' := Country,
          'filters' := Filters,
          'locale' := Locale
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'country' => Country,
       'filters' => Filters,
       'locale' => Locale
     }.
