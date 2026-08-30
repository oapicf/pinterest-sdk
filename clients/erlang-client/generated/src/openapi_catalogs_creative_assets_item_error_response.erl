-module(openapi_catalogs_creative_assets_item_error_response).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_item_error_response/0]).

-type openapi_catalogs_creative_assets_item_error_response() ::
    #{ 'catalog_type' := binary(),
       'creative_assets_id' => binary(),
       'errors' := list(),
       'item_response_kind' := binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'creative_assets_id' := CreativeAssetsId,
          'errors' := Errors,
          'item_response_kind' := ItemResponseKind
        }) ->
    #{ 'catalog_type' => CatalogType,
       'creative_assets_id' => CreativeAssetsId,
       'errors' => Errors,
       'item_response_kind' => ItemResponseKind
     }.
