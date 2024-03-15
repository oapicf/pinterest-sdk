-module(openapi_pin_media).

-export([encode/1]).

-export_type([openapi_pin_media/0]).

-type openapi_pin_media() ::
    #{ 'media_type' => binary()
     }.

encode(#{ 'media_type' := MediaType
        }) ->
    #{ 'media_type' => MediaType
     }.
