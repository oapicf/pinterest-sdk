-module(openapi_ad_account_owner).

-export([encode/1]).

-export_type([openapi_ad_account_owner/0]).

-type openapi_ad_account_owner() ::
    #{ 'id' => binary(),
       'username' => binary()
     }.

encode(#{ 'id' := Id,
          'username' := Username
        }) ->
    #{ 'id' => Id,
       'username' => Username
     }.
