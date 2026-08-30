-module(openapi_catalogs_hotel_item_response).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_item_response/0]).

-type openapi_catalogs_hotel_item_response() ::
    #{ 'attributes' => openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes(),
       'catalog_type' := binary(),
       'hotel_id' => binary(),
       'item_response_kind' := binary(),
       'pins' => list()
     }.

encode(#{ 'attributes' := Attributes,
          'catalog_type' := CatalogType,
          'hotel_id' := HotelId,
          'item_response_kind' := ItemResponseKind,
          'pins' := Pins
        }) ->
    #{ 'attributes' => Attributes,
       'catalog_type' => CatalogType,
       'hotel_id' => HotelId,
       'item_response_kind' => ItemResponseKind,
       'pins' => Pins
     }.
