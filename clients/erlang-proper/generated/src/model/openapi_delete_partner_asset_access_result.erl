-module(openapi_delete_partner_asset_access_result).

-include("openapi.hrl").

-export([openapi_delete_partner_asset_access_result/0]).

-export([openapi_delete_partner_asset_access_result/1]).

-export_type([openapi_delete_partner_asset_access_result/0]).

-type openapi_delete_partner_asset_access_result() ::
  [ {'asset_id', binary() }
  | {'asset_type', binary() }
  | {'is_shared_partner', boolean() }
  | {'partner_id', binary() }
  | {'permissions', list(binary()) }
  ].


openapi_delete_partner_asset_access_result() ->
    openapi_delete_partner_asset_access_result([]).

openapi_delete_partner_asset_access_result(Fields) ->
  Default = [ {'asset_id', binary() }
            , {'asset_type', binary() }
            , {'is_shared_partner', boolean() }
            , {'partner_id', binary() }
            , {'permissions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

