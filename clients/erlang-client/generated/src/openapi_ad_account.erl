-module(openapi_ad_account).

-export([encode/1]).

-export_type([openapi_ad_account/0]).

-type openapi_ad_account() ::
    #{ 'id' => binary(),
       'name' => binary(),
       'owner' => openapi_ad_account_owner:openapi_ad_account_owner(),
       'country' => openapi_country:openapi_country(),
       'currency' => openapi_currency:openapi_currency()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'owner' := Owner,
          'country' := Country,
          'currency' := Currency
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'owner' => Owner,
       'country' => Country,
       'currency' => Currency
     }.
