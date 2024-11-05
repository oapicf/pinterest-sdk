-module(openapi_update_partner_assets_result).

-include("openapi.hrl").

-export([openapi_update_partner_assets_result/0]).

-export([openapi_update_partner_assets_result/1]).

-export_type([openapi_update_partner_assets_result/0]).

-type openapi_update_partner_assets_result() ::
  [ {'asset_id', binary() }
  | {'asset_type', binary() }
  | {'partner_id', binary() }
  | {'permissions', list(binary()) }
  ].


openapi_update_partner_assets_result() ->
    openapi_update_partner_assets_result([]).

openapi_update_partner_assets_result(Fields) ->
  Default = [ {'asset_id', binary() }
            , {'asset_type', binary() }
            , {'partner_id', binary() }
            , {'permissions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

