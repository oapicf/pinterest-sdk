-module(openapi_asset_id_with_permissions).

-export([encode/1]).

-export_type([openapi_asset_id_with_permissions/0]).

-type openapi_asset_id_with_permissions() ::
    #{ 'id' => binary(),
       'permissions' => list()
     }.

encode(#{ 'id' := Id,
          'permissions' := Permissions
        }) ->
    #{ 'id' => Id,
       'permissions' => Permissions
     }.
