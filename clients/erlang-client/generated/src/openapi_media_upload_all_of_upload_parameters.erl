-module(openapi_media_upload_all_of_upload_parameters).

-export([encode/1]).

-export_type([openapi_media_upload_all_of_upload_parameters/0]).

-type openapi_media_upload_all_of_upload_parameters() ::
    #{ 'x_amz_date' => binary(),
       'x_amz_signature' => binary(),
       'x_amz_security_token' => binary(),
       'x_amz_algorithm' => binary(),
       'key' => binary(),
       'policy' => binary(),
       'x_amz_credential' => binary(),
       'Content_Type' => binary()
     }.

encode(#{ 'x_amz_date' := XAmzDate,
          'x_amz_signature' := XAmzSignature,
          'x_amz_security_token' := XAmzSecurityToken,
          'x_amz_algorithm' := XAmzAlgorithm,
          'key' := Key,
          'policy' := Policy,
          'x_amz_credential' := XAmzCredential,
          'Content_Type' := ContentType
        }) ->
    #{ 'x-amz-date' => XAmzDate,
       'x-amz-signature' => XAmzSignature,
       'x-amz-security-token' => XAmzSecurityToken,
       'x-amz-algorithm' => XAmzAlgorithm,
       'key' => Key,
       'policy' => Policy,
       'x-amz-credential' => XAmzCredential,
       'Content-Type' => ContentType
     }.
