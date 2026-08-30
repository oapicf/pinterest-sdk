-module(openapi_product_tag_item).

-export([encode/1]).

-export_type([openapi_product_tag_item/0]).

-type openapi_product_tag_item() ::
    #{ 'pin_id' := binary()
     }.

encode(#{ 'pin_id' := PinId
        }) ->
    #{ 'pin_id' => PinId
     }.
