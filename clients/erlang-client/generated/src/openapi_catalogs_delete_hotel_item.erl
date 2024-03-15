-module(openapi_catalogs_delete_hotel_item).

-export([encode/1]).

-export_type([openapi_catalogs_delete_hotel_item/0]).

-type openapi_catalogs_delete_hotel_item() ::
    #{ 'hotel_id' := binary(),
       'operation' := binary()
     }.

encode(#{ 'hotel_id' := HotelId,
          'operation' := Operation
        }) ->
    #{ 'hotel_id' => HotelId,
       'operation' => Operation
     }.
