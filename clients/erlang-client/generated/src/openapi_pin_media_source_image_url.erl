-module(openapi_pin_media_source_image_url).

-export([encode/1]).

-export_type([openapi_pin_media_source_image_url/0]).

-type openapi_pin_media_source_image_url() ::
    #{ 'source_type' := binary(),
       'url' := binary()
     }.

encode(#{ 'source_type' := SourceType,
          'url' := Url
        }) ->
    #{ 'source_type' => SourceType,
       'url' => Url
     }.
