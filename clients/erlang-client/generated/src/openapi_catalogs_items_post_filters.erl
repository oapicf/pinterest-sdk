-module(openapi_catalogs_items_post_filters).

-export([encode/1]).

-export_type([openapi_catalogs_items_post_filters/0]).

-type openapi_catalogs_items_post_filters() ::
    #{ 'catalog_id' => binary(),
       'catalog_type' := binary(),
       'item_ids' := list(),
       'hotel_ids' := list(),
       'creative_assets_ids' := list()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'item_ids' := ItemIds,
          'hotel_ids' := HotelIds,
          'creative_assets_ids' := CreativeAssetsIds
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'item_ids' => ItemIds,
       'hotel_ids' => HotelIds,
       'creative_assets_ids' => CreativeAssetsIds
     }.
