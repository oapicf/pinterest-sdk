-module(openapi_business_access_user_summary).

-export([encode/1]).

-export_type([openapi_business_access_user_summary/0]).

-type openapi_business_access_user_summary() ::
    #{ 'email' => binary(),
       'id' => binary(),
       'username' => binary()
     }.

encode(#{ 'email' := Email,
          'id' := Id,
          'username' := Username
        }) ->
    #{ 'email' => Email,
       'id' => Id,
       'username' => Username
     }.
