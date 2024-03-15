-module(openapi_pin_media_source_image_url).

-export([encode/1]).

-export_type([openapi_pin_media_source_image_url/0]).

-type openapi_pin_media_source_image_url() ::
    #{ 'source_type' := binary(),
       'url' := binary(),
       'is_standard' => boolean()
     }.

encode(#{ 'source_type' := SourceType,
          'url' := Url,
          'is_standard' := IsStandard
        }) ->
    #{ 'source_type' => SourceType,
       'url' => Url,
       'is_standard' => IsStandard
     }.
