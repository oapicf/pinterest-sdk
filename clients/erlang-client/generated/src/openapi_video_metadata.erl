-module(openapi_video_metadata).

-export([encode/1]).

-export_type([openapi_video_metadata/0]).

-type openapi_video_metadata() ::
    #{ 'item_type' => binary(),
       'cover_image_url' => binary(),
       'video_url' => binary(),
       'duration' => integer(),
       'height' => integer(),
       'width' => integer()
     }.

encode(#{ 'item_type' := ItemType,
          'cover_image_url' := CoverImageUrl,
          'video_url' := VideoUrl,
          'duration' := Duration,
          'height' := Height,
          'width' := Width
        }) ->
    #{ 'item_type' => ItemType,
       'cover_image_url' => CoverImageUrl,
       'video_url' => VideoUrl,
       'duration' => Duration,
       'height' => Height,
       'width' => Width
     }.
