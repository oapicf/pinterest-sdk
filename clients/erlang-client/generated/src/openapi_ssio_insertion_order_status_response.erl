-module(openapi_ssio_insertion_order_status_response).

-export([encode/1]).

-export_type([openapi_ssio_insertion_order_status_response/0]).

-type openapi_ssio_insertion_order_status_response() ::
    #{ 'pin_order_id' => binary(),
       'status' => binary(),
       'creation_time' => binary()
     }.

encode(#{ 'pin_order_id' := PinOrderId,
          'status' := Status,
          'creation_time' := CreationTime
        }) ->
    #{ 'pin_order_id' => PinOrderId,
       'status' => Status,
       'creation_time' => CreationTime
     }.
