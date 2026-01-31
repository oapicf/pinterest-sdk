-module(openapi_ad_account).

-export([encode/1]).

-export_type([openapi_ad_account/0]).

-type openapi_ad_account() ::
    #{ 'country' => openapi_country:openapi_country(),
       'created_time' => integer(),
       'currency' => openapi_currency:openapi_currency(),
       'id' := binary(),
       'name' => binary(),
       'owner' => openapi_ad_account_owner:openapi_ad_account_owner(),
       'permissions' => list(),
       'updated_time' => integer()
     }.

encode(#{ 'country' := Country,
          'created_time' := CreatedTime,
          'currency' := Currency,
          'id' := Id,
          'name' := Name,
          'owner' := Owner,
          'permissions' := Permissions,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'country' => Country,
       'created_time' => CreatedTime,
       'currency' => Currency,
       'id' => Id,
       'name' => Name,
       'owner' => Owner,
       'permissions' => Permissions,
       'updated_time' => UpdatedTime
     }.
