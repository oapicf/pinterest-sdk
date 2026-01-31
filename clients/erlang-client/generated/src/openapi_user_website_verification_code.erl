-module(openapi_user_website_verification_code).

-export([encode/1]).

-export_type([openapi_user_website_verification_code/0]).

-type openapi_user_website_verification_code() ::
    #{ 'dns_txt_record' => binary(),
       'file_content' => binary(),
       'filename' => binary(),
       'metatag' => binary(),
       'verification_code' => binary()
     }.

encode(#{ 'dns_txt_record' := DnsTxtRecord,
          'file_content' := FileContent,
          'filename' := Filename,
          'metatag' := Metatag,
          'verification_code' := VerificationCode
        }) ->
    #{ 'dns_txt_record' => DnsTxtRecord,
       'file_content' => FileContent,
       'filename' => Filename,
       'metatag' => Metatag,
       'verification_code' => VerificationCode
     }.
