-module(openapi_pin_media_source_images_base64).

-export([encode/1]).

-export_type([openapi_pin_media_source_images_base64/0]).

-type openapi_pin_media_source_images_base64() ::
    #{ 'source_type' => binary(),
       'items' := list(),
       'index' => integer()
     }.

encode(#{ 'source_type' := SourceType,
          'items' := Items,
          'index' := Index
        }) ->
    #{ 'source_type' => SourceType,
       'items' => Items,
       'index' => Index
     }.
