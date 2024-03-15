-module(openapi_hotel_processing_record).

-export([encode/1]).

-export_type([openapi_hotel_processing_record/0]).

-type openapi_hotel_processing_record() ::
    #{ 'hotel_id' => binary(),
       'errors' => list(),
       'warnings' => list(),
       'status' => openapi_item_processing_status:openapi_item_processing_status()
     }.

encode(#{ 'hotel_id' := HotelId,
          'errors' := Errors,
          'warnings' := Warnings,
          'status' := Status
        }) ->
    #{ 'hotel_id' => HotelId,
       'errors' => Errors,
       'warnings' => Warnings,
       'status' => Status
     }.
