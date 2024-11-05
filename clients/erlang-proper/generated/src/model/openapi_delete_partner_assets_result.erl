-module(openapi_delete_partner_assets_result).

-include("openapi.hrl").

-export([openapi_delete_partner_assets_result/0]).

-export([openapi_delete_partner_assets_result/1]).

-export_type([openapi_delete_partner_assets_result/0]).

-type openapi_delete_partner_assets_result() ::
  [ {'asset_id', binary() }
  | {'asset_type', binary() }
  | {'permissions', list(binary()) }
  | {'is_shared_partner', boolean() }
  | {'partner_id', binary() }
  ].


openapi_delete_partner_assets_result() ->
    openapi_delete_partner_assets_result([]).

openapi_delete_partner_assets_result(Fields) ->
  Default = [ {'asset_id', binary() }
            , {'asset_type', binary() }
            , {'permissions', list(binary()) }
            , {'is_shared_partner', boolean() }
            , {'partner_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

