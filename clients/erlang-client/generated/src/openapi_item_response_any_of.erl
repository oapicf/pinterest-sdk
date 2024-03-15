-module(openapi_item_response_any_of).

-export([encode/1]).

-export_type([openapi_item_response_any_of/0]).

-type openapi_item_response_any_of() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'item_id' => binary(),
       'pins' => list(),
       'attributes' => openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes(),
       'hotel_id' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'item_id' := ItemId,
          'pins' := Pins,
          'attributes' := Attributes,
          'hotel_id' := HotelId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'item_id' => ItemId,
       'pins' => Pins,
       'attributes' => Attributes,
       'hotel_id' => HotelId
     }.
