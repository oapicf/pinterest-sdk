-module(openapi_pin_media).

-export([encode/1]).

-export_type([openapi_pin_media/0]).

-type openapi_pin_media() ::
    #{ 'images' => openapi_image_size:openapi_image_size(),
       'media_type' := binary(),
       'cover_image_url' => binary(),
       'duration' => integer(),
       'height' => integer(),
       'video_url' => binary(),
       'video_url_hls' => binary(),
       'width' => integer(),
       'items' => list()
     }.

encode(#{ 'images' := Images,
          'media_type' := MediaType,
          'cover_image_url' := CoverImageUrl,
          'duration' := Duration,
          'height' := Height,
          'video_url' := VideoUrl,
          'video_url_hls' := VideoUrlHls,
          'width' := Width,
          'items' := Items
        }) ->
    #{ 'images' => Images,
       'media_type' => MediaType,
       'cover_image_url' => CoverImageUrl,
       'duration' => Duration,
       'height' => Height,
       'video_url' => VideoUrl,
       'video_url_hls' => VideoUrlHls,
       'width' => Width,
       'items' => Items
     }.
