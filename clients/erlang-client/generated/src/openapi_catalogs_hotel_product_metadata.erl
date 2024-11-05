-module(openapi_catalogs_hotel_product_metadata).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_product_metadata/0]).

-type openapi_catalogs_hotel_product_metadata() ::
    #{ 'hotel_id' := binary()
     }.

encode(#{ 'hotel_id' := HotelId
        }) ->
    #{ 'hotel_id' => HotelId
     }.
