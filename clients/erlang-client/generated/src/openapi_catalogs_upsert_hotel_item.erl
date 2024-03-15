-module(openapi_catalogs_upsert_hotel_item).

-export([encode/1]).

-export_type([openapi_catalogs_upsert_hotel_item/0]).

-type openapi_catalogs_upsert_hotel_item() ::
    #{ 'hotel_id' := binary(),
       'operation' := binary(),
       'attributes' := openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes()
     }.

encode(#{ 'hotel_id' := HotelId,
          'operation' := Operation,
          'attributes' := Attributes
        }) ->
    #{ 'hotel_id' => HotelId,
       'operation' => Operation,
       'attributes' => Attributes
     }.
