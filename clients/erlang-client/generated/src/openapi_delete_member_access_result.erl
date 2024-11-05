-module(openapi_delete_member_access_result).

-export([encode/1]).

-export_type([openapi_delete_member_access_result/0]).

-type openapi_delete_member_access_result() ::
    #{ 'asset_id' => binary(),
       'member_id' => binary()
     }.

encode(#{ 'asset_id' := AssetId,
          'member_id' := MemberId
        }) ->
    #{ 'asset_id' => AssetId,
       'member_id' => MemberId
     }.
