-module(openapi_media_upload_request).

-export([encode/1]).

-export_type([openapi_media_upload_request/0]).

-type openapi_media_upload_request() ::
    #{ 'media_type' := openapi_media_upload_type:openapi_media_upload_type()
     }.

encode(#{ 'media_type' := MediaType
        }) ->
    #{ 'media_type' => MediaType
     }.
