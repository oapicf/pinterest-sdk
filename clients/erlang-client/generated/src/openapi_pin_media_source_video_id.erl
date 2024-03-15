-module(openapi_pin_media_source_video_id).

-export([encode/1]).

-export_type([openapi_pin_media_source_video_id/0]).

-type openapi_pin_media_source_video_id() ::
    #{ 'source_type' := binary(),
       'cover_image_url' => binary(),
       'cover_image_content_type' => binary(),
       'cover_image_data' => binary(),
       'media_id' := binary(),
       'is_standard' => boolean()
     }.

encode(#{ 'source_type' := SourceType,
          'cover_image_url' := CoverImageUrl,
          'cover_image_content_type' := CoverImageContentType,
          'cover_image_data' := CoverImageData,
          'media_id' := MediaId,
          'is_standard' := IsStandard
        }) ->
    #{ 'source_type' => SourceType,
       'cover_image_url' => CoverImageUrl,
       'cover_image_content_type' => CoverImageContentType,
       'cover_image_data' => CoverImageData,
       'media_id' => MediaId,
       'is_standard' => IsStandard
     }.
