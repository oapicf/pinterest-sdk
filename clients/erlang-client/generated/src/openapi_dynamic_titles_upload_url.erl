-module(openapi_dynamic_titles_upload_url).

-export([encode/1]).

-export_type([openapi_dynamic_titles_upload_url/0]).

-type openapi_dynamic_titles_upload_url() ::
    #{ 'existing_filename' => binary(),
       'request_id' := binary(),
       'upload_url' := binary()
     }.

encode(#{ 'existing_filename' := ExistingFilename,
          'request_id' := RequestId,
          'upload_url' := UploadUrl
        }) ->
    #{ 'existing_filename' => ExistingFilename,
       'request_id' => RequestId,
       'upload_url' => UploadUrl
     }.
