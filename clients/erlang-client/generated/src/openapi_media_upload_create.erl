-module(openapi_media_upload_create).

-export([encode/1]).

-export_type([openapi_media_upload_create/0]).

-type openapi_media_upload_create() ::
    #{ 'media_type' := openapi_media_upload_type:openapi_media_upload_type()
     }.

encode(#{ 'media_type' := MediaType
        }) ->
    #{ 'media_type' => MediaType
     }.
