-module(openapi_user_single_asset_binding).

-export([encode/1]).

-export_type([openapi_user_single_asset_binding/0]).

-type openapi_user_single_asset_binding() ::
    #{ 'permissions' => list(),
       'user' => openapi_business_access_user_summary:openapi_business_access_user_summary()
     }.

encode(#{ 'permissions' := Permissions,
          'user' := User
        }) ->
    #{ 'permissions' => Permissions,
       'user' => User
     }.
