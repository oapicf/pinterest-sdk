-module(openapi_catalog_binding).

-export([encode/1]).

-export_type([openapi_catalog_binding/0]).

-type openapi_catalog_binding() ::
    #{ 'catalog_type' => binary(),
       'id' => binary(),
       'name' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'id' := Id,
          'name' := Name
        }) ->
    #{ 'catalog_type' => CatalogType,
       'id' => Id,
       'name' => Name
     }.
