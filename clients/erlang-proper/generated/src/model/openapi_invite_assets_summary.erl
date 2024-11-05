-module(openapi_invite_assets_summary).

-include("openapi.hrl").

-export([openapi_invite_assets_summary/0]).

-export([openapi_invite_assets_summary/1]).

-export_type([openapi_invite_assets_summary/0]).

-type openapi_invite_assets_summary() ::
  [ {'ad_accounts', list(openapi_invite_assets_summary_ad_accounts_inner:openapi_invite_assets_summary_ad_accounts_inner()) }
  | {'profiles', list(openapi_invite_assets_summary_profiles_inner:openapi_invite_assets_summary_profiles_inner()) }
  ].


openapi_invite_assets_summary() ->
    openapi_invite_assets_summary([]).

openapi_invite_assets_summary(Fields) ->
  Default = [ {'ad_accounts', list(openapi_invite_assets_summary_ad_accounts_inner:openapi_invite_assets_summary_ad_accounts_inner()) }
            , {'profiles', list(openapi_invite_assets_summary_profiles_inner:openapi_invite_assets_summary_profiles_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

