-module(openapi_integration_metadata).

-include("openapi.hrl").

-export([openapi_integration_metadata/0]).

-export([openapi_integration_metadata/1]).

-export_type([openapi_integration_metadata/0]).

-type openapi_integration_metadata() ::
  [ {'id', binary() }
  | {'external_business_id', binary() }
  | {'connected_merchant_id', binary() }
  | {'connected_user_id', binary() }
  | {'connected_advertiser_id', binary() }
  | {'connected_lba_id', binary() }
  | {'connected_tag_id', binary() }
  | {'partner_access_token_expiry', integer() }
  | {'partner_refresh_token_expiry', integer() }
  | {'scopes', binary() }
  | {'created_timestamp', integer() }
  | {'updated_timestamp', integer() }
  | {'additional_id_1', binary() }
  | {'partner_metadata', binary() }
  ].


openapi_integration_metadata() ->
    openapi_integration_metadata([]).

openapi_integration_metadata(Fields) ->
  Default = [ {'id', binary() }
            , {'external_business_id', binary() }
            , {'connected_merchant_id', binary() }
            , {'connected_user_id', binary() }
            , {'connected_advertiser_id', binary() }
            , {'connected_lba_id', binary() }
            , {'connected_tag_id', binary() }
            , {'partner_access_token_expiry', integer() }
            , {'partner_refresh_token_expiry', integer() }
            , {'scopes', binary() }
            , {'created_timestamp', integer() }
            , {'updated_timestamp', integer() }
            , {'additional_id_1', binary() }
            , {'partner_metadata', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

