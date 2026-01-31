-module(openapi_update_asset_group_response).

-export([encode/1]).

-export_type([openapi_update_asset_group_response/0]).

-type openapi_update_asset_group_response() ::
    #{ 'exceptions' => list(),
       'updated_asset_groups' => list()
     }.

encode(#{ 'exceptions' := Exceptions,
          'updated_asset_groups' := UpdatedAssetGroups
        }) ->
    #{ 'exceptions' => Exceptions,
       'updated_asset_groups' => UpdatedAssetGroups
     }.
