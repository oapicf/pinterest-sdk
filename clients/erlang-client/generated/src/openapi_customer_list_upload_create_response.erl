-module(openapi_customer_list_upload_create_response).

-export([encode/1]).

-export_type([openapi_customer_list_upload_create_response/0]).

-type openapi_customer_list_upload_create_response() ::
    #{ 'customer_list_upload' := openapi_customer_list_upload:openapi_customer_list_upload(),
       's3_multipart_upload_data' := openapi_s3_multipart_upload_data:openapi_s3_multipart_upload_data()
     }.

encode(#{ 'customer_list_upload' := CustomerListUpload,
          's3_multipart_upload_data' := S3MultipartUploadData
        }) ->
    #{ 'customer_list_upload' => CustomerListUpload,
       's3_multipart_upload_data' => S3MultipartUploadData
     }.
