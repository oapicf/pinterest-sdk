-module(openapi_catalogs_creative_assets_batch_item).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_batch_item/0]).

-type openapi_catalogs_creative_assets_batch_item() ::
    #{ 'attributes' := openapi_catalogs_updatable_creative_assets_attributes:openapi_catalogs_updatable_creative_assets_attributes(),
       'creative_assets_id' := binary(),
       'operation' := binary()
     }.

encode(#{ 'attributes' := Attributes,
          'creative_assets_id' := CreativeAssetsId,
          'operation' := Operation
        }) ->
    #{ 'attributes' => Attributes,
       'creative_assets_id' => CreativeAssetsId,
       'operation' => Operation
     }.
