-module(openapi_business_members_asset_access_delete_request_accesses_inner).

-export([encode/1]).

-export_type([openapi_business_members_asset_access_delete_request_accesses_inner/0]).

-type openapi_business_members_asset_access_delete_request_accesses_inner() ::
    #{ 'asset_id' := binary(),
       'member_id' := binary()
     }.

encode(#{ 'asset_id' := AssetId,
          'member_id' := MemberId
        }) ->
    #{ 'asset_id' => AssetId,
       'member_id' => MemberId
     }.
