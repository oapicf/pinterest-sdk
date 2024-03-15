-module(openapi_integration_record).

-include("openapi.hrl").

-export([openapi_integration_record/0]).

-export([openapi_integration_record/1]).

-export_type([openapi_integration_record/0]).

-type openapi_integration_record() ::
  [ {'id', binary() }
  | {'external_business_id', binary() }
  | {'connected_merchant_id', binary() }
  | {'connected_user_id', binary() }
  | {'connected_advertiser_id', binary() }
  | {'connected_lba_id', binary() }
  | {'connected_tag_id', binary() }
  | {'partner_access_token', binary() }
  | {'partner_refresh_token', binary() }
  | {'partner_primary_email', binary() }
  | {'partner_access_token_expiry', integer() }
  | {'partner_refresh_token_expiry', integer() }
  | {'scopes', binary() }
  | {'partner_metadata', binary() }
  | {'additional_id_1', binary() }
  | {'created_time', integer() }
  | {'updated_time', integer() }
  ].


openapi_integration_record() ->
    openapi_integration_record([]).

openapi_integration_record(Fields) ->
  Default = [ {'id', binary() }
            , {'external_business_id', binary() }
            , {'connected_merchant_id', binary() }
            , {'connected_user_id', binary() }
            , {'connected_advertiser_id', binary() }
            , {'connected_lba_id', binary() }
            , {'connected_tag_id', binary() }
            , {'partner_access_token', binary() }
            , {'partner_refresh_token', binary() }
            , {'partner_primary_email', binary() }
            , {'partner_access_token_expiry', integer() }
            , {'partner_refresh_token_expiry', integer() }
            , {'scopes', binary() }
            , {'partner_metadata', binary() }
            , {'additional_id_1', binary() }
            , {'created_time', integer() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

