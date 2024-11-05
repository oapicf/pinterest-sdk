-module(openapi_invite_assets_summary).

-export([encode/1]).

-export_type([openapi_invite_assets_summary/0]).

-type openapi_invite_assets_summary() ::
    #{ 'ad_accounts' => list(),
       'profiles' => list()
     }.

encode(#{ 'ad_accounts' := AdAccounts,
          'profiles' := Profiles
        }) ->
    #{ 'ad_accounts' => AdAccounts,
       'profiles' => Profiles
     }.
