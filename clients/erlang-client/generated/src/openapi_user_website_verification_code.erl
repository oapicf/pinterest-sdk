-module(openapi_user_website_verification_code).

-export([encode/1]).

-export_type([openapi_user_website_verification_code/0]).

-type openapi_user_website_verification_code() ::
    #{ 'verification_code' => binary(),
       'dns_txt_record' => binary(),
       'metatag' => binary(),
       'filename' => binary(),
       'file_content' => binary()
     }.

encode(#{ 'verification_code' := VerificationCode,
          'dns_txt_record' := DnsTxtRecord,
          'metatag' := Metatag,
          'filename' := Filename,
          'file_content' := FileContent
        }) ->
    #{ 'verification_code' => VerificationCode,
       'dns_txt_record' => DnsTxtRecord,
       'metatag' => Metatag,
       'filename' => Filename,
       'file_content' => FileContent
     }.
