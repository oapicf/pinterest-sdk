-module(openapi_catalog).

-export([encode/1]).

-export_type([openapi_catalog/0]).

-type openapi_catalog() ::
    #{ 'created_at' := openapi_date_time:openapi_date_time(),
       'id' := binary(),
       'updated_at' := openapi_date_time:openapi_date_time(),
       'name' := binary(),
       'catalog_type' := openapi_catalogs_type:openapi_catalogs_type()
     }.

encode(#{ 'created_at' := CreatedAt,
          'id' := Id,
          'updated_at' := UpdatedAt,
          'name' := Name,
          'catalog_type' := CatalogType
        }) ->
    #{ 'created_at' => CreatedAt,
       'id' => Id,
       'updated_at' => UpdatedAt,
       'name' => Name,
       'catalog_type' => CatalogType
     }.
