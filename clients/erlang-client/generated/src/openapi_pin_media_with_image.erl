-module(openapi_pin_media_with_image).

-export([encode/1]).

-export_type([openapi_pin_media_with_image/0]).

-type openapi_pin_media_with_image() ::
    #{ 'images' => maps:map(),
       'media_type' => binary()
     }.

encode(#{ 'images' := Images,
          'media_type' := MediaType
        }) ->
    #{ 'images' => Images,
       'media_type' => MediaType
     }.
