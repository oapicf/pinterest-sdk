-module(openapi_account).

-export([encode/1]).

-export_type([openapi_account/0]).

-type openapi_account() ::
    #{ 'account_type' => binary(),
       'profile_image' => binary(),
       'website_url' => binary(),
       'username' => binary()
     }.

encode(#{ 'account_type' := AccountType,
          'profile_image' := ProfileImage,
          'website_url' := WebsiteUrl,
          'username' := Username
        }) ->
    #{ 'account_type' => AccountType,
       'profile_image' => ProfileImage,
       'website_url' => WebsiteUrl,
       'username' => Username
     }.
