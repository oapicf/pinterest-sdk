-module(openapi_catalogs_hotel_item_response).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_item_response/0]).

-type openapi_catalogs_hotel_item_response() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'hotel_id' => binary(),
       'pins' => list(),
       'attributes' => openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'hotel_id' := HotelId,
          'pins' := Pins,
          'attributes' := Attributes
        }) ->
    #{ 'catalog_type' => CatalogType,
       'hotel_id' => HotelId,
       'pins' => Pins,
       'attributes' => Attributes
     }.
