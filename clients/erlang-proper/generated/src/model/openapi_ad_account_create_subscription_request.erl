-module(openapi_ad_account_create_subscription_request).

-include("openapi.hrl").

-export([openapi_ad_account_create_subscription_request/0]).

-export([openapi_ad_account_create_subscription_request/1]).

-export_type([openapi_ad_account_create_subscription_request/0]).

-type openapi_ad_account_create_subscription_request() ::
  [ {'lead_form_id', binary() }
  | {'partner_access_token', binary() }
  | {'partner_metadata', openapi_ad_account_create_subscription_request_partner_metadata:openapi_ad_account_create_subscription_request_partner_metadata() }
  | {'partner_refresh_token', binary() }
  | {'webhook_url', binary() }
  ].


openapi_ad_account_create_subscription_request() ->
    openapi_ad_account_create_subscription_request([]).

openapi_ad_account_create_subscription_request(Fields) ->
  Default = [ {'lead_form_id', binary() }
            , {'partner_access_token', binary() }
            , {'partner_metadata', openapi_ad_account_create_subscription_request_partner_metadata:openapi_ad_account_create_subscription_request_partner_metadata() }
            , {'partner_refresh_token', binary() }
            , {'webhook_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

