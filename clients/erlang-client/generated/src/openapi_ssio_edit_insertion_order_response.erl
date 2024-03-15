-module(openapi_ssio_edit_insertion_order_response).

-export([encode/1]).

-export_type([openapi_ssio_edit_insertion_order_response/0]).

-type openapi_ssio_edit_insertion_order_response() ::
    #{ 'pin_order_id' => binary()
     }.

encode(#{ 'pin_order_id' := PinOrderId
        }) ->
    #{ 'pin_order_id' => PinOrderId
     }.
