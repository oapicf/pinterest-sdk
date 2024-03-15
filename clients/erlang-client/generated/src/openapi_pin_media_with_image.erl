-module(openapi_pin_media_with_image).

-export([encode/1]).

-export_type([openapi_pin_media_with_image/0]).

-type openapi_pin_media_with_image() ::
    #{ 'media_type' => binary(),
       'images' => openapi_image_metadata_images:openapi_image_metadata_images()
     }.

encode(#{ 'media_type' := MediaType,
          'images' := Images
        }) ->
    #{ 'media_type' => MediaType,
       'images' => Images
     }.
