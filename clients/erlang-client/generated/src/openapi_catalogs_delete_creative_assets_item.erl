-module(openapi_catalogs_delete_creative_assets_item).

-export([encode/1]).

-export_type([openapi_catalogs_delete_creative_assets_item/0]).

-type openapi_catalogs_delete_creative_assets_item() ::
    #{ 'creative_assets_id' := binary(),
       'operation' := binary()
     }.

encode(#{ 'creative_assets_id' := CreativeAssetsId,
          'operation' := Operation
        }) ->
    #{ 'creative_assets_id' => CreativeAssetsId,
       'operation' => Operation
     }.
