-module(openapi_pin_media_with_video).

-export([encode/1]).

-export_type([openapi_pin_media_with_video/0]).

-type openapi_pin_media_with_video() ::
    #{ 'media_type' => binary(),
       'images' => openapi_image_metadata_images:openapi_image_metadata_images(),
       'cover_image_url' => binary(),
       'video_url' => binary(),
       'duration' => integer(),
       'height' => integer(),
       'width' => integer()
     }.

encode(#{ 'media_type' := MediaType,
          'images' := Images,
          'cover_image_url' := CoverImageUrl,
          'video_url' := VideoUrl,
          'duration' := Duration,
          'height' := Height,
          'width' := Width
        }) ->
    #{ 'media_type' => MediaType,
       'images' => Images,
       'cover_image_url' => CoverImageUrl,
       'video_url' => VideoUrl,
       'duration' => Duration,
       'height' => Height,
       'width' => Width
     }.
