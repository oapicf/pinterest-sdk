-module(openapi_user_website).

-export([encode/1]).

-export_type([openapi_user_website/0]).

-type openapi_user_website() ::
    #{ 'status' => binary(),
       'verified_at' => binary(),
       'website' => binary()
     }.

encode(#{ 'status' := Status,
          'verified_at' := VerifiedAt,
          'website' := Website
        }) ->
    #{ 'status' => Status,
       'verified_at' => VerifiedAt,
       'website' => Website
     }.
