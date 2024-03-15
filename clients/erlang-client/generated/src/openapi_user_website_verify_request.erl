-module(openapi_user_website_verify_request).

-export([encode/1]).

-export_type([openapi_user_website_verify_request/0]).

-type openapi_user_website_verify_request() ::
    #{ 'website' => binary(),
       'verification_method' => binary()
     }.

encode(#{ 'website' := Website,
          'verification_method' := VerificationMethod
        }) ->
    #{ 'website' => Website,
       'verification_method' => VerificationMethod
     }.
