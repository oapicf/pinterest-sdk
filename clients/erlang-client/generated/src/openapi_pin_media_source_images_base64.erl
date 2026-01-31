-module(openapi_pin_media_source_images_base64).

-export([encode/1]).

-export_type([openapi_pin_media_source_images_base64/0]).

-type openapi_pin_media_source_images_base64() ::
    #{ 'index' => integer(),
       'items' := list(),
       'source_type' := binary()
     }.

encode(#{ 'index' := Index,
          'items' := Items,
          'source_type' := SourceType
        }) ->
    #{ 'index' => Index,
       'items' => Items,
       'source_type' => SourceType
     }.
