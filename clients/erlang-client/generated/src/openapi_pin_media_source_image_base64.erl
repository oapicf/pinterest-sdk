-module(openapi_pin_media_source_image_base64).

-export([encode/1]).

-export_type([openapi_pin_media_source_image_base64/0]).

-type openapi_pin_media_source_image_base64() ::
    #{ 'source_type' := binary(),
       'content_type' := binary(),
       'data' := binary(),
       'is_standard' => boolean()
     }.

encode(#{ 'source_type' := SourceType,
          'content_type' := ContentType,
          'data' := Data,
          'is_standard' := IsStandard
        }) ->
    #{ 'source_type' => SourceType,
       'content_type' => ContentType,
       'data' => Data,
       'is_standard' => IsStandard
     }.
