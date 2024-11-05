-module(openapi_invite_assets_summary_profiles_inner).

-include("openapi.hrl").

-export([openapi_invite_assets_summary_profiles_inner/0]).

-export([openapi_invite_assets_summary_profiles_inner/1]).

-export_type([openapi_invite_assets_summary_profiles_inner/0]).

-type openapi_invite_assets_summary_profiles_inner() ::
  [ {'id', binary() }
  | {'permissions', list(binary()) }
  ].


openapi_invite_assets_summary_profiles_inner() ->
    openapi_invite_assets_summary_profiles_inner([]).

openapi_invite_assets_summary_profiles_inner(Fields) ->
  Default = [ {'id', binary() }
            , {'permissions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

