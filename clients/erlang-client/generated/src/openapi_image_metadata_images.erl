-module(openapi_image_metadata_images).

-export([encode/1]).

-export_type([openapi_image_metadata_images/0]).

-type openapi_image_metadata_images() ::
    #{ '150x150' => openapi_image_details:openapi_image_details(),
       '400x300' => openapi_image_details:openapi_image_details(),
       '600x' => openapi_image_details:openapi_image_details(),
       '1200x' => openapi_image_details:openapi_image_details()
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
