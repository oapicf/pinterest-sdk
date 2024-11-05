-module(openapi_update_partner_asset_access_body_accesses_inner).

-include("openapi.hrl").

-export([openapi_update_partner_asset_access_body_accesses_inner/0]).

-export([openapi_update_partner_asset_access_body_accesses_inner/1]).

-export_type([openapi_update_partner_asset_access_body_accesses_inner/0]).

-type openapi_update_partner_asset_access_body_accesses_inner() ::
  [ {'partner_id', binary() }
  | {'asset_id', binary() }
  | {'permissions', list(openapi_permissions:openapi_permissions()) }
  ].


openapi_update_partner_asset_access_body_accesses_inner() ->
    openapi_update_partner_asset_access_body_accesses_inner([]).

openapi_update_partner_asset_access_body_accesses_inner(Fields) ->
  Default = [ {'partner_id', binary() }
            , {'asset_id', binary() }
            , {'permissions', list(openapi_permissions:openapi_permissions(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

