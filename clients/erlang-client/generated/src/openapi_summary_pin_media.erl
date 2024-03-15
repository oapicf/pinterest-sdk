-module(openapi_summary_pin_media).

-export([encode/1]).

-export_type([openapi_summary_pin_media/0]).

-type openapi_summary_pin_media() ::
    #{ 'media_type' => binary()
     }.

encode(#{ 'media_type' := MediaType
        }) ->
    #{ 'media_type' => MediaType
     }.
