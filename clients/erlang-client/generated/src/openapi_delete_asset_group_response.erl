-module(openapi_delete_asset_group_response).

-export([encode/1]).

-export_type([openapi_delete_asset_group_response/0]).

-type openapi_delete_asset_group_response() ::
    #{ 'deleted_asset_groups' => list(),
       'exceptions' => list()
     }.

encode(#{ 'deleted_asset_groups' := DeletedAssetGroups,
          'exceptions' := Exceptions
        }) ->
    #{ 'deleted_asset_groups' => DeletedAssetGroups,
       'exceptions' => Exceptions
     }.
