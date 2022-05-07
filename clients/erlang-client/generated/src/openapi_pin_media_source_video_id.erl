-module(openapi_pin_media_source_video_id).

-export([encode/1]).

-export_type([openapi_pin_media_source_video_id/0]).

-type openapi_pin_media_source_video_id() ::
    #{ 'source_type' := binary(),
       'cover_image_url' := binary(),
       'media_id' := binary()
     }.

encode(#{ 'source_type' := SourceType,
          'cover_image_url' := CoverImageUrl,
          'media_id' := MediaId
        }) ->
    #{ 'source_type' => SourceType,
       'cover_image_url' => CoverImageUrl,
       'media_id' => MediaId
     }.
