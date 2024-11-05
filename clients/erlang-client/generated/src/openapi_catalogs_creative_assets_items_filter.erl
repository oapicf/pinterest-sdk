-module(openapi_catalogs_creative_assets_items_filter).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_items_filter/0]).

-type openapi_catalogs_creative_assets_items_filter() ::
    #{ 'catalog_type' := binary(),
       'creative_assets_ids' := list(),
       'catalog_id' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'creative_assets_ids' := CreativeAssetsIds,
          'catalog_id' := CatalogId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'creative_assets_ids' => CreativeAssetsIds,
       'catalog_id' => CatalogId
     }.
