-module(openapi_business_member_assets_summary_ad_accounts_inner).

-export([encode/1]).

-export_type([openapi_business_member_assets_summary_ad_accounts_inner/0]).

-type openapi_business_member_assets_summary_ad_accounts_inner() ::
    #{ 'id' => binary(),
       'permissions' => list()
     }.

encode(#{ 'id' := Id,
          'permissions' := Permissions
        }) ->
    #{ 'id' => Id,
       'permissions' => Permissions
     }.
