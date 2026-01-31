-module(openapi_pin_media_source_video_id).

-export([encode/1]).

-export_type([openapi_pin_media_source_video_id/0]).

-type openapi_pin_media_source_video_id() ::
    #{ 'cover_image_content_type' => openapi_content_type:openapi_content_type(),
       'cover_image_data' => binary(),
       'cover_image_key_frame_time' => integer(),
       'cover_image_url' => binary(),
       'is_standard' => boolean(),
       'media_id' := binary(),
       'source_type' := binary()
     }.

encode(#{ 'cover_image_content_type' := CoverImageContentType,
          'cover_image_data' := CoverImageData,
          'cover_image_key_frame_time' := CoverImageKeyFrameTime,
          'cover_image_url' := CoverImageUrl,
          'is_standard' := IsStandard,
          'media_id' := MediaId,
          'source_type' := SourceType
        }) ->
    #{ 'cover_image_content_type' => CoverImageContentType,
       'cover_image_data' => CoverImageData,
       'cover_image_key_frame_time' => CoverImageKeyFrameTime,
       'cover_image_url' => CoverImageUrl,
       'is_standard' => IsStandard,
       'media_id' => MediaId,
       'source_type' => SourceType
     }.
