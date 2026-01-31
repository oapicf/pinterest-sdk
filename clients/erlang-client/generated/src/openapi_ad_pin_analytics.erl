-module(openapi_ad_pin_analytics).

-export([encode/1]).

-export_type([openapi_ad_pin_analytics/0]).

-type openapi_ad_pin_analytics() ::
    #{ 'DATE' => calendar:date(),
       'PIN_ID' := binary()
     }.

encode(#{ 'DATE' := DATE,
          'PIN_ID' := PINID
        }) ->
    #{ 'DATE' => DATE,
       'PIN_ID' => PINID
     }.
