-module(openapi_asset_group_deletion).

-export([encode/1]).

-export_type([openapi_asset_group_deletion/0]).

-type openapi_asset_group_deletion() ::
    #{ 'deleted_asset_groups' => list(),
       'exceptions' => list()
     }.

encode(#{ 'deleted_asset_groups' := DeletedAssetGroups,
          'exceptions' := Exceptions
        }) ->
    #{ 'deleted_asset_groups' => DeletedAssetGroups,
       'exceptions' => Exceptions
     }.
