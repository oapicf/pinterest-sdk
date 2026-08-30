-module(openapi_bid_options_app_type_multipliers).

-export([encode/1]).

-export_type([openapi_bid_options_app_type_multipliers/0]).

-type openapi_bid_options_app_type_multipliers() ::
    #{ 'android_mobile' => integer(),
       'android_tablet' => integer(),
       'ipad' => integer(),
       'iphone' => integer(),
       'web' => integer(),
       'web_mobile' => integer()
     }.

encode(#{ 'android_mobile' := AndroidMobile,
          'android_tablet' := AndroidTablet,
          'ipad' := Ipad,
          'iphone' := Iphone,
          'web' := Web,
          'web_mobile' := WebMobile
        }) ->
    #{ 'android_mobile' => AndroidMobile,
       'android_tablet' => AndroidTablet,
       'ipad' => Ipad,
       'iphone' => Iphone,
       'web' => Web,
       'web_mobile' => WebMobile
     }.
