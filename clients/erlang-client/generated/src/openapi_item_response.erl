-module(openapi_item_response).

-export([encode/1]).

-export_type([openapi_item_response/0]).

-type openapi_item_response() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'item_id' => binary(),
       'pins' => list(),
       'attributes' => openapi_catalogs_creative_assets_attributes:openapi_catalogs_creative_assets_attributes(),
       'hotel_id' => binary(),
       'creative_assets_id' => binary(),
       'errors' => list()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'item_id' := ItemId,
          'pins' := Pins,
          'attributes' := Attributes,
          'hotel_id' := HotelId,
          'creative_assets_id' := CreativeAssetsId,
          'errors' := Errors
        }) ->
    #{ 'catalog_type' => CatalogType,
       'item_id' => ItemId,
       'pins' => Pins,
       'attributes' => Attributes,
       'hotel_id' => HotelId,
       'creative_assets_id' => CreativeAssetsId,
       'errors' => Errors
     }.
