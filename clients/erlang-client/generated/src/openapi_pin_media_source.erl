-module(openapi_pin_media_source).

-export([encode/1]).

-export_type([openapi_pin_media_source/0]).

-type openapi_pin_media_source() ::
    #{ 'source_type' := binary(),
       'content_type' := binary(),
       'data' := binary(),
       'is_standard' => boolean(),
       'url' := binary(),
       'cover_image_url' => binary(),
       'cover_image_content_type' => binary(),
       'cover_image_data' => binary(),
       'media_id' := binary(),
       'items' := list(),
       'index' => integer(),
       'is_affiliate_link' => boolean()
     }.

encode(#{ 'source_type' := SourceType,
          'content_type' := ContentType,
          'data' := Data,
          'is_standard' := IsStandard,
          'url' := Url,
          'cover_image_url' := CoverImageUrl,
          'cover_image_content_type' := CoverImageContentType,
          'cover_image_data' := CoverImageData,
          'media_id' := MediaId,
          'items' := Items,
          'index' := Index,
          'is_affiliate_link' := IsAffiliateLink
        }) ->
    #{ 'source_type' => SourceType,
       'content_type' => ContentType,
       'data' => Data,
       'is_standard' => IsStandard,
       'url' => Url,
       'cover_image_url' => CoverImageUrl,
       'cover_image_content_type' => CoverImageContentType,
       'cover_image_data' => CoverImageData,
       'media_id' => MediaId,
       'items' => Items,
       'index' => Index,
       'is_affiliate_link' => IsAffiliateLink
     }.
