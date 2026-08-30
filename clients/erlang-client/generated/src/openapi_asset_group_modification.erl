-module(openapi_asset_group_modification).

-export([encode/1]).

-export_type([openapi_asset_group_modification/0]).

-type openapi_asset_group_modification() ::
    #{ 'exceptions' => list(),
       'updated_asset_groups' => list()
     }.

encode(#{ 'exceptions' := Exceptions,
          'updated_asset_groups' := UpdatedAssetGroups
        }) ->
    #{ 'exceptions' => Exceptions,
       'updated_asset_groups' => UpdatedAssetGroups
     }.
