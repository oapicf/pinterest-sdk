-module(openapi_pin_media_source_images_url).

-export([encode/1]).

-export_type([openapi_pin_media_source_images_url/0]).

-type openapi_pin_media_source_images_url() ::
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
