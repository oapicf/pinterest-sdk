-module(openapi_s3_file_part).

-export([encode/1]).

-export_type([openapi_s3_file_part/0]).

-type openapi_s3_file_part() ::
    #{ 'part_number' := integer(),
       'presigned_url' := binary()
     }.

encode(#{ 'part_number' := PartNumber,
          'presigned_url' := PresignedUrl
        }) ->
    #{ 'part_number' => PartNumber,
       'presigned_url' => PresignedUrl
     }.
