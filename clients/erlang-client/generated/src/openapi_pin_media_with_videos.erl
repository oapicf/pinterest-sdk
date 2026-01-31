-module(openapi_pin_media_with_videos).

-export([encode/1]).

-export_type([openapi_pin_media_with_videos/0]).

-type openapi_pin_media_with_videos() ::
    #{ 'items' => list(),
       'media_type' := binary()
     }.

encode(#{ 'items' := Items,
          'media_type' := MediaType
        }) ->
    #{ 'items' => Items,
       'media_type' => MediaType
     }.
