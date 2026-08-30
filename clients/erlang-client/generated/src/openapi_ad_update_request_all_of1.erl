-module(openapi_ad_update_request_all_of1).

-export([encode/1]).

-export_type([openapi_ad_update_request_all_of1/0]).

-type openapi_ad_update_request_all_of1() ::
    #{ 'id' := binary(),
       'pin_id' => binary()
     }.

encode(#{ 'id' := Id,
          'pin_id' := PinId
        }) ->
    #{ 'id' => Id,
       'pin_id' => PinId
     }.
