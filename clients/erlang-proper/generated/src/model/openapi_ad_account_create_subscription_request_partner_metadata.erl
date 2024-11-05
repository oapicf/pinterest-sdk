-module(openapi_ad_account_create_subscription_request_partner_metadata).

-include("openapi.hrl").

-export([openapi_ad_account_create_subscription_request_partner_metadata/0]).

-export([openapi_ad_account_create_subscription_request_partner_metadata/1]).

-export_type([openapi_ad_account_create_subscription_request_partner_metadata/0]).

-type openapi_ad_account_create_subscription_request_partner_metadata() ::
  [ {'subscriber_key', binary() }
  ].


openapi_ad_account_create_subscription_request_partner_metadata() ->
    openapi_ad_account_create_subscription_request_partner_metadata([]).

openapi_ad_account_create_subscription_request_partner_metadata(Fields) ->
  Default = [ {'subscriber_key', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

