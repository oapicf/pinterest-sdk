-module(openapi_media_upload_details).

-export([encode/1]).

-export_type([openapi_media_upload_details/0]).

-type openapi_media_upload_details() ::
    #{ 'media_id' => binary(),
       'media_type' => openapi_media_upload_type:openapi_media_upload_type(),
       'status' => openapi_media_upload_status:openapi_media_upload_status()
     }.

encode(#{ 'media_id' := MediaId,
          'media_type' := MediaType,
          'status' := Status
        }) ->
    #{ 'media_id' => MediaId,
       'media_type' => MediaType,
       'status' => Status
     }.
