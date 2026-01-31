-module(openapi_integration_request).

-include("openapi.hrl").

-export([openapi_integration_request/0]).

-export([openapi_integration_request/1]).

-export_type([openapi_integration_request/0]).

-type openapi_integration_request() ::
  [ {'additional_id_1', binary() }
  | {'connected_advertiser_id', binary() }
  | {'connected_lba_id', binary() }
  | {'connected_merchant_id', binary() }
  | {'connected_tag_id', binary() }
  | {'external_business_id', binary() }
  | {'partner_access_token', binary() }
  | {'partner_access_token_expiry', integer() }
  | {'partner_metadata', binary() }
  | {'partner_primary_email', binary() }
  | {'partner_refresh_token', binary() }
  | {'partner_refresh_token_expiry', integer() }
  | {'scopes', binary() }
  ].


openapi_integration_request() ->
    openapi_integration_request([]).

openapi_integration_request(Fields) ->
  Default = [ {'additional_id_1', binary() }
            , {'connected_advertiser_id', binary() }
            , {'connected_lba_id', binary() }
            , {'connected_merchant_id', binary() }
            , {'connected_tag_id', binary() }
            , {'external_business_id', binary() }
            , {'partner_access_token', binary() }
            , {'partner_access_token_expiry', integer() }
            , {'partner_metadata', binary() }
            , {'partner_primary_email', binary() }
            , {'partner_refresh_token', binary() }
            , {'partner_refresh_token_expiry', integer() }
            , {'scopes', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

