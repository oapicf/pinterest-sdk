-module(openapi_pin_media_with_image_and_video).

-export([encode/1]).

-export_type([openapi_pin_media_with_image_and_video/0]).

-type openapi_pin_media_with_image_and_video() ::
    #{ 'items' => list(),
       'media_type' := binary()
     }.

encode(#{ 'items' := Items,
          'media_type' := MediaType
        }) ->
    #{ 'items' => Items,
       'media_type' => MediaType
     }.
