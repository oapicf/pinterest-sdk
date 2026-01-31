-module(openapi_catalogs_items_filters).

-export([encode/1]).

-export_type([openapi_catalogs_items_filters/0]).

-type openapi_catalogs_items_filters() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'catalog_id' => binary(),
       'item_ids' := list(),
       'hotel_ids' := list(),
       'creative_assets_ids' := list()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'catalog_id' := CatalogId,
          'item_ids' := ItemIds,
          'hotel_ids' := HotelIds,
          'creative_assets_ids' := CreativeAssetsIds
        }) ->
    #{ 'catalog_type' => CatalogType,
       'catalog_id' => CatalogId,
       'item_ids' => ItemIds,
       'hotel_ids' => HotelIds,
       'creative_assets_ids' => CreativeAssetsIds
     }.
