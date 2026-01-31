-module(openapi_s3_multipart_upload_data).

-include("openapi.hrl").

-export([openapi_s3_multipart_upload_data/0]).

-export([openapi_s3_multipart_upload_data/1]).

-export_type([openapi_s3_multipart_upload_data/0]).

-type openapi_s3_multipart_upload_data() ::
  [ {'file_parts', list(openapi_s3_file_part:openapi_s3_file_part()) }
  ].


openapi_s3_multipart_upload_data() ->
    openapi_s3_multipart_upload_data([]).

openapi_s3_multipart_upload_data(Fields) ->
  Default = [ {'file_parts', list(openapi_s3_file_part:openapi_s3_file_part()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

