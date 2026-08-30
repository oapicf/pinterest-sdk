-module(openapi_ssio_insertion_order).

-export([encode/1]).

-export_type([openapi_ssio_insertion_order/0]).

-type openapi_ssio_insertion_order() ::
    #{ 'pin_order_id' => binary()
     }.

encode(#{ 'pin_order_id' := PinOrderId
        }) ->
    #{ 'pin_order_id' => PinOrderId
     }.
