-module(openapi_item_response_any_of_1).

-export([encode/1]).

-export_type([openapi_item_response_any_of_1/0]).

-type openapi_item_response_any_of_1() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'item_id' => binary(),
       'errors' => list(),
       'hotel_id' => binary(),
       'creative_assets_id' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'item_id' := ItemId,
          'errors' := Errors,
          'hotel_id' := HotelId,
          'creative_assets_id' := CreativeAssetsId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'item_id' => ItemId,
       'errors' => Errors,
       'hotel_id' => HotelId,
       'creative_assets_id' => CreativeAssetsId
     }.
