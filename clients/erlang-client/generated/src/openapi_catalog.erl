-module(openapi_catalog).

-export([encode/1]).

-export_type([openapi_catalog/0]).

-type openapi_catalog() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'created_at' := openapi_date_time:openapi_date_time(),
       'id' := binary(),
       'name' := binary(),
       'updated_at' := openapi_date_time:openapi_date_time()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'created_at' := CreatedAt,
          'id' := Id,
          'name' := Name,
          'updated_at' := UpdatedAt
        }) ->
    #{ 'catalog_type' => CatalogType,
       'created_at' => CreatedAt,
       'id' => Id,
       'name' => Name,
       'updated_at' => UpdatedAt
     }.
