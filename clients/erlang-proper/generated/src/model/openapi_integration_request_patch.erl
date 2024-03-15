-module(openapi_integration_request_patch).

-include("openapi.hrl").

-export([openapi_integration_request_patch/0]).

-export([openapi_integration_request_patch/1]).

-export_type([openapi_integration_request_patch/0]).

-type openapi_integration_request_patch() ::
  [ {'connected_merchant_id', binary() }
  | {'connected_advertiser_id', binary() }
  | {'connected_lba_id', binary() }
  | {'connected_tag_id', binary() }
  | {'partner_access_token', binary() }
  | {'partner_refresh_token', binary() }
  | {'partner_primary_email', binary() }
  | {'partner_access_token_expiry', integer() }
  | {'partner_refresh_token_expiry', integer() }
  | {'scopes', binary() }
  | {'additional_id_1', binary() }
  | {'partner_metadata', binary() }
  ].


openapi_integration_request_patch() ->
    openapi_integration_request_patch([]).

openapi_integration_request_patch(Fields) ->
  Default = [ {'connected_merchant_id', binary() }
            , {'connected_advertiser_id', binary() }
            , {'connected_lba_id', binary() }
            , {'connected_tag_id', binary() }
            , {'partner_access_token', binary() }
            , {'partner_refresh_token', binary() }
            , {'partner_primary_email', binary() }
            , {'partner_access_token_expiry', integer() }
            , {'partner_refresh_token_expiry', integer() }
            , {'scopes', binary() }
            , {'additional_id_1', binary() }
            , {'partner_metadata', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

