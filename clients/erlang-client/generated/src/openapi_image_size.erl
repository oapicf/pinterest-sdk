-module(openapi_image_size).

-export([encode/1]).

-export_type([openapi_image_size/0]).

-type openapi_image_size() ::
    #{ '1200x' => openapi_image_details:openapi_image_details(),
       '150x150' => openapi_image_details:openapi_image_details(),
       '400x300' => openapi_image_details:openapi_image_details(),
       '600x' => openapi_image_details:openapi_image_details()
     }.

encode(#{ '1200x' := 1200x,
          '150x150' := 150x150,
          '400x300' := 400x300,
          '600x' := 600x
        }) ->
    #{ '1200x' => 1200x,
       '150x150' => 150x150,
       '400x300' => 400x300,
       '600x' => 600x
     }.
