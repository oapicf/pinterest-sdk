-module(openapi_ad_preview_request).

-export([encode/1]).

-export_type([openapi_ad_preview_request/0]).

-type openapi_ad_preview_request() ::
    #{ 'image_url' := binary(),
       'title' := binary(),
       'pin_id' := binary()
     }.

encode(#{ 'image_url' := ImageUrl,
          'title' := Title,
          'pin_id' := PinId
        }) ->
    #{ 'image_url' => ImageUrl,
       'title' => Title,
       'pin_id' => PinId
     }.
