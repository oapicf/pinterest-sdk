-module(openapi_integration_metadata).

-include("openapi.hrl").

-export([openapi_integration_metadata/0]).

-export([openapi_integration_metadata/1]).

-export_type([openapi_integration_metadata/0]).

-type openapi_integration_metadata() ::
  [ {'additional_id_1', binary() }
  | {'connected_advertiser_id', binary() }
  | {'connected_lba_id', binary() }
  | {'connected_merchant_id', binary() }
  | {'connected_tag_id', binary() }
  | {'connected_user_id', binary() }
  | {'created_timestamp', integer() }
  | {'external_business_id', binary() }
  | {'id', binary() }
  | {'partner_access_token_expiry', integer() }
  | {'partner_metadata', binary() }
  | {'partner_refresh_token_expiry', integer() }
  | {'scopes', binary() }
  | {'updated_timestamp', integer() }
  ].


openapi_integration_metadata() ->
    openapi_integration_metadata([]).

openapi_integration_metadata(Fields) ->
  Default = [ {'additional_id_1', binary() }
            , {'connected_advertiser_id', binary() }
            , {'connected_lba_id', binary() }
            , {'connected_merchant_id', binary() }
            , {'connected_tag_id', binary() }
            , {'connected_user_id', binary() }
            , {'created_timestamp', integer() }
            , {'external_business_id', binary() }
            , {'id', binary() }
            , {'partner_access_token_expiry', integer() }
            , {'partner_metadata', binary() }
            , {'partner_refresh_token_expiry', integer() }
            , {'scopes', binary() }
            , {'updated_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

