-module(openapi_catalogs_hotel_product_group).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_product_group/0]).

-type openapi_catalogs_hotel_product_group() ::
    #{ 'catalog_type' := binary(),
       'id' := binary(),
       'name' => binary(),
       'description' => binary(),
       'filters' := openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters(),
       'created_at' => integer(),
       'updated_at' => integer(),
       'catalog_id' := binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'id' := Id,
          'name' := Name,
          'description' := Description,
          'filters' := Filters,
          'created_at' := CreatedAt,
          'updated_at' := UpdatedAt,
          'catalog_id' := CatalogId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'id' => Id,
       'name' => Name,
       'description' => Description,
       'filters' => Filters,
       'created_at' => CreatedAt,
       'updated_at' => UpdatedAt,
       'catalog_id' => CatalogId
     }.
