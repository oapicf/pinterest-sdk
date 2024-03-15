-module(openapi_ad_preview_create_from_pin).

-export([encode/1]).

-export_type([openapi_ad_preview_create_from_pin/0]).

-type openapi_ad_preview_create_from_pin() ::
    #{ 'pin_id' := binary()
     }.

encode(#{ 'pin_id' := PinId
        }) ->
    #{ 'pin_id' => PinId
     }.
