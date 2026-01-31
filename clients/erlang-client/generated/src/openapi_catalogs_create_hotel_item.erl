-module(openapi_catalogs_create_hotel_item).

-export([encode/1]).

-export_type([openapi_catalogs_create_hotel_item/0]).

-type openapi_catalogs_create_hotel_item() ::
    #{ 'attributes' := openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes(),
       'hotel_id' := binary(),
       'operation' := binary()
     }.

encode(#{ 'attributes' := Attributes,
          'hotel_id' := HotelId,
          'operation' := Operation
        }) ->
    #{ 'attributes' => Attributes,
       'hotel_id' => HotelId,
       'operation' => Operation
     }.
