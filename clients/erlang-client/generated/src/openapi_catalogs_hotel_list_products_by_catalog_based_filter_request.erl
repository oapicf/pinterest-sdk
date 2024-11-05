-module(openapi_catalogs_hotel_list_products_by_catalog_based_filter_request).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_list_products_by_catalog_based_filter_request/0]).

-type openapi_catalogs_hotel_list_products_by_catalog_based_filter_request() ::
    #{ 'catalog_type' := binary(),
       'catalog_id' := binary(),
       'filters' := openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'catalog_id' := CatalogId,
          'filters' := Filters
        }) ->
    #{ 'catalog_type' => CatalogType,
       'catalog_id' => CatalogId,
       'filters' => Filters
     }.
