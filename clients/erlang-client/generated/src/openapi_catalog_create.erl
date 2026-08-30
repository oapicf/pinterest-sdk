-module(openapi_catalog_create).

-export([encode/1]).

-export_type([openapi_catalog_create/0]).

-type openapi_catalog_create() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'name' := binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'name' := Name
        }) ->
    #{ 'catalog_type' => CatalogType,
       'name' => Name
     }.
