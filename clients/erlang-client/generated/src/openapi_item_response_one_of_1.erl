-module(openapi_item_response_one_of_1).

-export([encode/1]).

-export_type([openapi_item_response_one_of_1/0]).

-type openapi_item_response_one_of_1() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'errors' := list(),
       'item_id' => binary(),
       'hotel_id' => binary(),
       'creative_assets_id' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'errors' := Errors,
          'item_id' := ItemId,
          'hotel_id' := HotelId,
          'creative_assets_id' := CreativeAssetsId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'errors' => Errors,
       'item_id' => ItemId,
       'hotel_id' => HotelId,
       'creative_assets_id' => CreativeAssetsId
     }.
