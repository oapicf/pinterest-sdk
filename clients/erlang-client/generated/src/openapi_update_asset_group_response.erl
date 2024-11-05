-module(openapi_update_asset_group_response).

-export([encode/1]).

-export_type([openapi_update_asset_group_response/0]).

-type openapi_update_asset_group_response() ::
    #{ 'updated_asset_groups' => list(),
       'exceptions' => list()
     }.

encode(#{ 'updated_asset_groups' := UpdatedAssetGroups,
          'exceptions' := Exceptions
        }) ->
    #{ 'updated_asset_groups' => UpdatedAssetGroups,
       'exceptions' => Exceptions
     }.
