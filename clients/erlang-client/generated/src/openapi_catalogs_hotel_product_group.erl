-module(openapi_catalogs_hotel_product_group).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_product_group/0]).

-type openapi_catalogs_hotel_product_group() ::
    #{ 'catalog_id' := binary(),
       'catalog_type' := binary(),
       'created_at' => integer(),
       'description' => binary(),
       'filters' := openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters(),
       'id' := binary(),
       'name' => binary(),
       'type' := openapi_catalogs_hotel_product_group_type:openapi_catalogs_hotel_product_group_type(),
       'updated_at' => integer()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'created_at' := CreatedAt,
          'description' := Description,
          'filters' := Filters,
          'id' := Id,
          'name' := Name,
          'type' := Type,
          'updated_at' := UpdatedAt
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'created_at' => CreatedAt,
       'description' => Description,
       'filters' => Filters,
       'id' => Id,
       'name' => Name,
       'type' => Type,
       'updated_at' => UpdatedAt
     }.
