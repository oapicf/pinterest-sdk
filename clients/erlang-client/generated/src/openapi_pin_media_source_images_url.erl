-module(openapi_pin_media_source_images_url).

-export([encode/1]).

-export_type([openapi_pin_media_source_images_url/0]).

-type openapi_pin_media_source_images_url() ::
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
