-module(openapi_get_business_assets_response_catalog_info).

-export([encode/1]).

-export_type([openapi_get_business_assets_response_catalog_info/0]).

-type openapi_get_business_assets_response_catalog_info() ::
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
