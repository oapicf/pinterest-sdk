-module(openapi_ad_account_create_request).

-export([encode/1]).

-export_type([openapi_ad_account_create_request/0]).

-type openapi_ad_account_create_request() ::
    #{ 'country' => openapi_country:openapi_country(),
       'name' => binary(),
       'owner_user_id' => binary()
     }.

encode(#{ 'country' := Country,
          'name' := Name,
          'owner_user_id' := OwnerUserId
        }) ->
    #{ 'country' => Country,
       'name' => Name,
       'owner_user_id' => OwnerUserId
     }.
