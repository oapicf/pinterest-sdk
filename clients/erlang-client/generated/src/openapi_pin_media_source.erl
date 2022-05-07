-module(openapi_pin_media_source).

-export([encode/1]).

-export_type([openapi_pin_media_source/0]).

-type openapi_pin_media_source() ::
    #{ 'source_type' := binary(),
       'content_type' := binary(),
       'data' := binary(),
       'url' := binary(),
       'cover_image_url' := binary(),
       'media_id' := binary()
     }.

encode(#{ 'source_type' := SourceType,
          'content_type' := ContentType,
          'data' := Data,
          'url' := Url,
          'cover_image_url' := CoverImageUrl,
          'media_id' := MediaId
        }) ->
    #{ 'source_type' => SourceType,
       'content_type' => ContentType,
       'data' => Data,
       'url' => Url,
       'cover_image_url' => CoverImageUrl,
       'media_id' => MediaId
     }.
