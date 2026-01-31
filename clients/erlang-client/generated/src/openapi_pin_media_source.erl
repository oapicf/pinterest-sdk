-module(openapi_pin_media_source).

-export([encode/1]).

-export_type([openapi_pin_media_source/0]).

-type openapi_pin_media_source() ::
    #{ 'content_type' := openapi_content_type:openapi_content_type(),
       'data' := binary(),
       'is_standard' => boolean(),
       'source_type' := binary(),
       'url' := binary(),
       'cover_image_content_type' => openapi_content_type:openapi_content_type(),
       'cover_image_data' => binary(),
       'cover_image_key_frame_time' => integer(),
       'cover_image_url' => binary(),
       'media_id' := binary(),
       'index' => integer(),
       'items' := list(),
       'is_affiliate_link' => boolean()
     }.

encode(#{ 'content_type' := ContentType,
          'data' := Data,
          'is_standard' := IsStandard,
          'source_type' := SourceType,
          'url' := Url,
          'cover_image_content_type' := CoverImageContentType,
          'cover_image_data' := CoverImageData,
          'cover_image_key_frame_time' := CoverImageKeyFrameTime,
          'cover_image_url' := CoverImageUrl,
          'media_id' := MediaId,
          'index' := Index,
          'items' := Items,
          'is_affiliate_link' := IsAffiliateLink
        }) ->
    #{ 'content_type' => ContentType,
       'data' => Data,
       'is_standard' => IsStandard,
       'source_type' => SourceType,
       'url' => Url,
       'cover_image_content_type' => CoverImageContentType,
       'cover_image_data' => CoverImageData,
       'cover_image_key_frame_time' => CoverImageKeyFrameTime,
       'cover_image_url' => CoverImageUrl,
       'media_id' => MediaId,
       'index' => Index,
       'items' => Items,
       'is_affiliate_link' => IsAffiliateLink
     }.
