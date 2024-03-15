-module(openapi_ad_account).

-export([encode/1]).

-export_type([openapi_ad_account/0]).

-type openapi_ad_account() ::
    #{ 'id' => binary(),
       'name' => binary(),
       'owner' => openapi_ad_account_owner:openapi_ad_account_owner(),
       'country' => openapi_country:openapi_country(),
       'currency' => openapi_currency:openapi_currency(),
       'permissions' => list(),
       'created_time' => integer(),
       'updated_time' => integer()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'owner' := Owner,
          'country' := Country,
          'currency' := Currency,
          'permissions' := Permissions,
          'created_time' := CreatedTime,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'owner' => Owner,
       'country' => Country,
       'currency' => Currency,
       'permissions' => Permissions,
       'created_time' => CreatedTime,
       'updated_time' => UpdatedTime
     }.
