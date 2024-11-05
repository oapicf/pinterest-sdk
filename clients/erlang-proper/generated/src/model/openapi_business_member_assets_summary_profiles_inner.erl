-module(openapi_business_member_assets_summary_profiles_inner).

-include("openapi.hrl").

-export([openapi_business_member_assets_summary_profiles_inner/0]).

-export([openapi_business_member_assets_summary_profiles_inner/1]).

-export_type([openapi_business_member_assets_summary_profiles_inner/0]).

-type openapi_business_member_assets_summary_profiles_inner() ::
  [ {'id', binary() }
  | {'permissions', list(binary()) }
  ].


openapi_business_member_assets_summary_profiles_inner() ->
    openapi_business_member_assets_summary_profiles_inner([]).

openapi_business_member_assets_summary_profiles_inner(Fields) ->
  Default = [ {'id', binary(1, 20) }
            , {'permissions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

