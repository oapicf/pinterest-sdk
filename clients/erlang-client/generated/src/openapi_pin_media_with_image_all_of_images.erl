-module(openapi_pin_media_with_image_all_of_images).

-export([encode/1]).

-export_type([openapi_pin_media_with_image_all_of_images/0]).

-type openapi_pin_media_with_image_all_of_images() ::
    #{ '150x150' => maps:map(),
       '400x300' => maps:map(),
       '600x' => maps:map(),
       '1200x' => maps:map()
     }.

encode(#{ '150x150' := 150x150,
          '400x300' := 400x300,
          '600x' := 600x,
          '1200x' := 1200x
        }) ->
    #{ '150x150' => 150x150,
       '400x300' => 400x300,
       '600x' => 600x,
       '1200x' => 1200x
     }.
