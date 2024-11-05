-module(openapi_user_single_asset_binding).

-include("openapi.hrl").

-export([openapi_user_single_asset_binding/0]).

-export([openapi_user_single_asset_binding/1]).

-export_type([openapi_user_single_asset_binding/0]).

-type openapi_user_single_asset_binding() ::
  [ {'permissions', list(binary()) }
  | {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  ].


openapi_user_single_asset_binding() ->
    openapi_user_single_asset_binding([]).

openapi_user_single_asset_binding(Fields) ->
  Default = [ {'permissions', list(binary()) }
            , {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

