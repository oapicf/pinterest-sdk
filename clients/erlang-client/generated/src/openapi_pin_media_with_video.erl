-module(openapi_pin_media_with_video).

-export([encode/1]).

-export_type([openapi_pin_media_with_video/0]).

-type openapi_pin_media_with_video() ::
    #{ 'cover_image_url' => binary(),
       'duration' => integer(),
       'height' => integer(),
       'images' => openapi_image_size:openapi_image_size(),
       'media_type' := binary(),
       'video_url' => binary(),
       'width' => integer()
     }.

encode(#{ 'cover_image_url' := CoverImageUrl,
          'duration' := Duration,
          'height' := Height,
          'images' := Images,
          'media_type' := MediaType,
          'video_url' := VideoUrl,
          'width' := Width
        }) ->
    #{ 'cover_image_url' => CoverImageUrl,
       'duration' => Duration,
       'height' => Height,
       'images' => Images,
       'media_type' => MediaType,
       'video_url' => VideoUrl,
       'width' => Width
     }.
