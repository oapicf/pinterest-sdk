-module(openapi_invite_assets_summary).

-include("openapi.hrl").

-export([openapi_invite_assets_summary/0]).

-export([openapi_invite_assets_summary/1]).

-export_type([openapi_invite_assets_summary/0]).

-type openapi_invite_assets_summary() ::
  [ {'ad_accounts', list(openapi_invite_assets_summary_item:openapi_invite_assets_summary_item()) }
  | {'profiles', list(openapi_invite_assets_summary_item:openapi_invite_assets_summary_item()) }
  ].


openapi_invite_assets_summary() ->
    openapi_invite_assets_summary([]).

openapi_invite_assets_summary(Fields) ->
  Default = [ {'ad_accounts', list(openapi_invite_assets_summary_item:openapi_invite_assets_summary_item()) }
            , {'profiles', list(openapi_invite_assets_summary_item:openapi_invite_assets_summary_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

