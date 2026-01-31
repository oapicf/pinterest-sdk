-module(openapi_customer_list_upload_create_response).

-include("openapi.hrl").

-export([openapi_customer_list_upload_create_response/0]).

-export([openapi_customer_list_upload_create_response/1]).

-export_type([openapi_customer_list_upload_create_response/0]).

-type openapi_customer_list_upload_create_response() ::
  [ {'customer_list_upload', openapi_customer_list_upload:openapi_customer_list_upload() }
  | {'s3_multipart_upload_data', openapi_s3_multipart_upload_data:openapi_s3_multipart_upload_data() }
  ].


openapi_customer_list_upload_create_response() ->
    openapi_customer_list_upload_create_response([]).

openapi_customer_list_upload_create_response(Fields) ->
  Default = [ {'customer_list_upload', openapi_customer_list_upload:openapi_customer_list_upload() }
            , {'s3_multipart_upload_data', openapi_s3_multipart_upload_data:openapi_s3_multipart_upload_data() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

