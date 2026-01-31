-module(openapi_user_website_summary).

-export([encode/1]).

-export_type([openapi_user_website_summary/0]).

-type openapi_user_website_summary() ::
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
