-module(openapi_ad_pin_id).

-export([encode/1]).

-export_type([openapi_ad_pin_id/0]).

-type openapi_ad_pin_id() ::
    #{ 'pin_id' => binary()
     }.

encode(#{ 'pin_id' := PinId
        }) ->
    #{ 'pin_id' => PinId
     }.
