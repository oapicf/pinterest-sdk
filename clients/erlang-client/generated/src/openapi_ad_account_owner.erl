-module(openapi_ad_account_owner).

-export([encode/1]).

-export_type([openapi_ad_account_owner/0]).

-type openapi_ad_account_owner() ::
    #{ 'username' => binary()
     }.

encode(#{ 'username' := Username
        }) ->
    #{ 'username' => Username
     }.
