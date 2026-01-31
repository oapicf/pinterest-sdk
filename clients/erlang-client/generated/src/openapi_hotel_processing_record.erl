-module(openapi_hotel_processing_record).

-export([encode/1]).

-export_type([openapi_hotel_processing_record/0]).

-type openapi_hotel_processing_record() ::
    #{ 'errors' => list(),
       'hotel_id' => binary(),
       'status' => openapi_item_processing_status:openapi_item_processing_status(),
       'warnings' => list()
     }.

encode(#{ 'errors' := Errors,
          'hotel_id' := HotelId,
          'status' := Status,
          'warnings' := Warnings
        }) ->
    #{ 'errors' => Errors,
       'hotel_id' => HotelId,
       'status' => Status,
       'warnings' => Warnings
     }.
