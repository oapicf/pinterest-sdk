-module(openapi_catalogs_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_create_request/0]).

-type openapi_catalogs_create_request() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'name' := binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'name' := Name
        }) ->
    #{ 'catalog_type' => CatalogType,
       'name' => Name
     }.
