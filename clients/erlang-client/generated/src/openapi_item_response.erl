-module(openapi_item_response).

-export([encode/1]).

-export_type([openapi_item_response/0]).

-type openapi_item_response() ::
    #{ 'attributes' => openapi_catalogs_creative_assets_attributes:openapi_catalogs_creative_assets_attributes(),
       'catalog_type' := binary(),
       'item_id' => binary(),
       'item_response_kind' := binary(),
       'pins' => list(),
       'hotel_id' => binary(),
       'creative_assets_id' => binary(),
       'errors' := list()
     }.

encode(#{ 'attributes' := Attributes,
          'catalog_type' := CatalogType,
          'item_id' := ItemId,
          'item_response_kind' := ItemResponseKind,
          'pins' := Pins,
          'hotel_id' := HotelId,
          'creative_assets_id' := CreativeAssetsId,
          'errors' := Errors
        }) ->
    #{ 'attributes' => Attributes,
       'catalog_type' => CatalogType,
       'item_id' => ItemId,
       'item_response_kind' => ItemResponseKind,
       'pins' => Pins,
       'hotel_id' => HotelId,
       'creative_assets_id' => CreativeAssetsId,
       'errors' => Errors
     }.
