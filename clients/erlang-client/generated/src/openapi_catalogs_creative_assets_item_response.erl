-module(openapi_catalogs_creative_assets_item_response).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_item_response/0]).

-type openapi_catalogs_creative_assets_item_response() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'creative_assets_id' => binary(),
       'pins' => list(),
       'attributes' => openapi_catalogs_creative_assets_attributes:openapi_catalogs_creative_assets_attributes()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'creative_assets_id' := CreativeAssetsId,
          'pins' := Pins,
          'attributes' := Attributes
        }) ->
    #{ 'catalog_type' => CatalogType,
       'creative_assets_id' => CreativeAssetsId,
       'pins' => Pins,
       'attributes' => Attributes
     }.
