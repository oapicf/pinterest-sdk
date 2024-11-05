-module(openapi_catalogs_creative_assets_item_error_response).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_item_error_response/0]).

-type openapi_catalogs_creative_assets_item_error_response() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'creative_assets_id' => binary(),
       'errors' => list()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'creative_assets_id' := CreativeAssetsId,
          'errors' := Errors
        }) ->
    #{ 'catalog_type' => CatalogType,
       'creative_assets_id' => CreativeAssetsId,
       'errors' => Errors
     }.
