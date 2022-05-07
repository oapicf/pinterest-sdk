-module(openapi_pin_media_with_image_all_of).

-export([encode/1]).

-export_type([openapi_pin_media_with_image_all_of/0]).

-type openapi_pin_media_with_image_all_of() ::
    #{ 'images' => maps:map()
     }.

encode(#{ 'images' := Images
        }) ->
    #{ 'images' => Images
     }.
