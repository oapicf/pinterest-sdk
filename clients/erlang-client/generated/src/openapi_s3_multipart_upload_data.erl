-module(openapi_s3_multipart_upload_data).

-export([encode/1]).

-export_type([openapi_s3_multipart_upload_data/0]).

-type openapi_s3_multipart_upload_data() ::
    #{ 'file_parts' => list()
     }.

encode(#{ 'file_parts' := FileParts
        }) ->
    #{ 'file_parts' => FileParts
     }.
