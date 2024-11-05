-module(openapi_users_for_individual_asset_response).

-export([encode/1]).

-export_type([openapi_users_for_individual_asset_response/0]).

-type openapi_users_for_individual_asset_response() ::
    #{ 'asset_id' => binary(),
       'member_id' => binary(),
       'permissions' => list()
     }.

encode(#{ 'asset_id' := AssetId,
          'member_id' := MemberId,
          'permissions' := Permissions
        }) ->
    #{ 'asset_id' => AssetId,
       'member_id' => MemberId,
       'permissions' => Permissions
     }.
