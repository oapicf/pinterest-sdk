-module(openapi_catalog_update).

-export([encode/1]).

-export_type([openapi_catalog_update/0]).

-type openapi_catalog_update() ::
    #{ 'catalog_type' => openapi_catalogs_type:openapi_catalogs_type(),
       'name' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'name' := Name
        }) ->
    #{ 'catalog_type' => CatalogType,
       'name' => Name
     }.
