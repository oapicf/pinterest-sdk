-module(openapi_media_upload).

-export([encode/1]).

-export_type([openapi_media_upload/0]).

-type openapi_media_upload() ::
    #{ 'media_id' => binary(),
       'media_type' => openapi_media_upload_type:openapi_media_upload_type(),
       'upload_url' => binary(),
       'upload_parameters' => openapi_media_upload_all_of_upload_parameters:openapi_media_upload_all_of_upload_parameters()
     }.

encode(#{ 'media_id' := MediaId,
          'media_type' := MediaType,
          'upload_url' := UploadUrl,
          'upload_parameters' := UploadParameters
        }) ->
    #{ 'media_id' => MediaId,
       'media_type' => MediaType,
       'upload_url' => UploadUrl,
       'upload_parameters' => UploadParameters
     }.
