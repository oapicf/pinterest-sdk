-module(openapi_catalogs_hotel_list_products_by_catalog_based_filter_request).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_list_products_by_catalog_based_filter_request/0]).

-type openapi_catalogs_hotel_list_products_by_catalog_based_filter_request() ::
    #{ 'catalog_id' := binary(),
       'catalog_type' := binary(),
       'filters' := openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'filters' := Filters
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'filters' => Filters
     }.
