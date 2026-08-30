-module(openapi_video_metadata_with_item_type).

-export([encode/1]).

-export_type([openapi_video_metadata_with_item_type/0]).

-type openapi_video_metadata_with_item_type() ::
    #{ 'cover_image_url' => binary(),
       'duration' => integer(),
       'height' => integer(),
       'item_type' := binary(),
       'video_url' => binary(),
       'video_url_hls' => binary(),
       'width' => integer()
     }.

encode(#{ 'cover_image_url' := CoverImageUrl,
          'duration' := Duration,
          'height' := Height,
          'item_type' := ItemType,
          'video_url' := VideoUrl,
          'video_url_hls' := VideoUrlHls,
          'width' := Width
        }) ->
    #{ 'cover_image_url' => CoverImageUrl,
       'duration' => Duration,
       'height' => Height,
       'item_type' => ItemType,
       'video_url' => VideoUrl,
       'video_url_hls' => VideoUrlHls,
       'width' => Width
     }.
