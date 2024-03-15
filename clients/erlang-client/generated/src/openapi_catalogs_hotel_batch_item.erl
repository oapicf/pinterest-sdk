-module(openapi_catalogs_hotel_batch_item).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_batch_item/0]).

-type openapi_catalogs_hotel_batch_item() ::
    #{ 'hotel_id' := binary(),
       'operation' := binary(),
       'attributes' := openapi_catalogs_updatable_hotel_attributes:openapi_catalogs_updatable_hotel_attributes()
     }.

encode(#{ 'hotel_id' := HotelId,
          'operation' := Operation,
          'attributes' := Attributes
        }) ->
    #{ 'hotel_id' => HotelId,
       'operation' => Operation,
       'attributes' => Attributes
     }.
