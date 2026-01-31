-module(openapi_pin_media_with_images).

-export([encode/1]).

-export_type([openapi_pin_media_with_images/0]).

-type openapi_pin_media_with_images() ::
    #{ 'items' => list(),
       'media_type' := binary()
     }.

encode(#{ 'items' := Items,
          'media_type' := MediaType
        }) ->
    #{ 'items' => Items,
       'media_type' => MediaType
     }.
