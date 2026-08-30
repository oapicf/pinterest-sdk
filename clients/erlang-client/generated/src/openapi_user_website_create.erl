-module(openapi_user_website_create).

-export([encode/1]).

-export_type([openapi_user_website_create/0]).

-type openapi_user_website_create() ::
    #{ 'verification_method' => openapi_website_verification_method:openapi_website_verification_method(),
       'website' => binary()
     }.

encode(#{ 'verification_method' := VerificationMethod,
          'website' := Website
        }) ->
    #{ 'verification_method' => VerificationMethod,
       'website' => Website
     }.
