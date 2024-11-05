-module(openapi_catalogs_hotel_product_group_product_counts).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_product_group_product_counts/0]).

-type openapi_catalogs_hotel_product_group_product_counts() ::
    #{ 'catalog_type' := binary(),
       'total' := integer()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'total' := Total
        }) ->
    #{ 'catalog_type' => CatalogType,
       'total' => Total
     }.
