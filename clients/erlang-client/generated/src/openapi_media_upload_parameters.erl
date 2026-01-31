-module(openapi_media_upload_parameters).

-export([encode/1]).

-export_type([openapi_media_upload_parameters/0]).

-type openapi_media_upload_parameters() ::
    #{ 'Content_Type' => binary(),
       'key' => binary(),
       'policy' => binary(),
       'x_amz_algorithm' => binary(),
       'x_amz_credential' => binary(),
       'x_amz_date' => binary(),
       'x_amz_security_token' => binary(),
       'x_amz_signature' => binary()
     }.

encode(#{ 'Content_Type' := ContentType,
          'key' := Key,
          'policy' := Policy,
          'x_amz_algorithm' := XAmzAlgorithm,
          'x_amz_credential' := XAmzCredential,
          'x_amz_date' := XAmzDate,
          'x_amz_security_token' := XAmzSecurityToken,
          'x_amz_signature' := XAmzSignature
        }) ->
    #{ 'Content-Type' => ContentType,
       'key' => Key,
       'policy' => Policy,
       'x-amz-algorithm' => XAmzAlgorithm,
       'x-amz-credential' => XAmzCredential,
       'x-amz-date' => XAmzDate,
       'x-amz-security-token' => XAmzSecurityToken,
       'x-amz-signature' => XAmzSignature
     }.
