-module(openapi_ad_account_create).

-export([encode/1]).

-export_type([openapi_ad_account_create/0]).

-type openapi_ad_account_create() ::
    #{ 'country' => openapi_country:openapi_country(),
       'currency' => openapi_currency:openapi_currency(),
       'name' => binary(),
       'owner_user_id' => binary(),
       'time_zone' => binary()
     }.

encode(#{ 'country' := Country,
          'currency' := Currency,
          'name' := Name,
          'owner_user_id' := OwnerUserId,
          'time_zone' := TimeZone
        }) ->
    #{ 'country' => Country,
       'currency' => Currency,
       'name' => Name,
       'owner_user_id' => OwnerUserId,
       'time_zone' => TimeZone
     }.
