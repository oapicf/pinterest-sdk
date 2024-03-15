-module(openapi_catalogs_hotel_product_group_update_request).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_product_group_update_request/0]).

-type openapi_catalogs_hotel_product_group_update_request() ::
    #{ 'catalog_type' => binary(),
       'name' => binary(),
       'description' => binary(),
       'filters' => openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'name' := Name,
          'description' := Description,
          'filters' := Filters
        }) ->
    #{ 'catalog_type' => CatalogType,
       'name' => Name,
       'description' => Description,
       'filters' => Filters
     }.
