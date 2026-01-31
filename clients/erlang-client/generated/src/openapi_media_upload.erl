-module(openapi_media_upload).

-export([encode/1]).

-export_type([openapi_media_upload/0]).

-type openapi_media_upload() ::
    #{ 'media_id' := binary(),
       'media_type' := openapi_media_upload_type:openapi_media_upload_type(),
       'upload_parameters' => openapi_media_upload_parameters:openapi_media_upload_parameters(),
       'upload_url' => binary()
     }.

encode(#{ 'media_id' := MediaId,
          'media_type' := MediaType,
          'upload_parameters' := UploadParameters,
          'upload_url' := UploadUrl
        }) ->
    #{ 'media_id' => MediaId,
       'media_type' => MediaType,
       'upload_parameters' => UploadParameters,
       'upload_url' => UploadUrl
     }.
