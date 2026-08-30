-module(openapi_lead_subscription_post_params).

-include("openapi.hrl").

-export([openapi_lead_subscription_post_params/0]).

-export([openapi_lead_subscription_post_params/1]).

-export_type([openapi_lead_subscription_post_params/0]).

-type openapi_lead_subscription_post_params() ::
  [ {'ad_account_id', binary() }
  | {'api_version', binary() }
  | {'created_time', integer() }
  | {'cryptographic_algorithm', binary() }
  | {'cryptographic_key', binary() }
  | {'id', binary() }
  | {'lead_form_id', binary() }
  | {'user_account_id', binary() }
  | {'webhook_url', binary() }
  | {'partner_access_token', binary() }
  | {'partner_metadata', openapi_partner_metadata:openapi_partner_metadata() }
  | {'partner_refresh_token', binary() }
  ].


openapi_lead_subscription_post_params() ->
    openapi_lead_subscription_post_params([]).

openapi_lead_subscription_post_params(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'api_version', binary() }
            , {'created_time', integer() }
            , {'cryptographic_algorithm', binary() }
            , {'cryptographic_key', binary() }
            , {'id', binary() }
            , {'lead_form_id', binary() }
            , {'user_account_id', binary() }
            , {'webhook_url', binary() }
            , {'partner_access_token', binary() }
            , {'partner_metadata', openapi_partner_metadata:openapi_partner_metadata() }
            , {'partner_refresh_token', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

