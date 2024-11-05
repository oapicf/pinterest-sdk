-module(openapi_delete_partner_asset_access_body_accesses_inner).

-include("openapi.hrl").

-export([openapi_delete_partner_asset_access_body_accesses_inner/0]).

-export([openapi_delete_partner_asset_access_body_accesses_inner/1]).

-export_type([openapi_delete_partner_asset_access_body_accesses_inner/0]).

-type openapi_delete_partner_asset_access_body_accesses_inner() ::
  [ {'partner_id', binary() }
  | {'asset_id', binary() }
  | {'partner_type', binary() }
  ].


openapi_delete_partner_asset_access_body_accesses_inner() ->
    openapi_delete_partner_asset_access_body_accesses_inner([]).

openapi_delete_partner_asset_access_body_accesses_inner(Fields) ->
  Default = [ {'partner_id', binary() }
            , {'asset_id', binary() }
            , {'partner_type', elements([<<"INTERNAL">>, <<"EXTERNAL">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

