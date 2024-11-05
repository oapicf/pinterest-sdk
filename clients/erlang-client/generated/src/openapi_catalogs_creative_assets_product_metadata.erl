-module(openapi_catalogs_creative_assets_product_metadata).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_product_metadata/0]).

-type openapi_catalogs_creative_assets_product_metadata() ::
    #{ 'creative_assets_id' := binary(),
       'visibility' := openapi_creative_assets_visibility_type:openapi_creative_assets_visibility_type()
     }.

encode(#{ 'creative_assets_id' := CreativeAssetsId,
          'visibility' := Visibility
        }) ->
    #{ 'creative_assets_id' => CreativeAssetsId,
       'visibility' => Visibility
     }.
