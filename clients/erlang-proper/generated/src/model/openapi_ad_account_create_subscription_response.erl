-module(openapi_ad_account_create_subscription_response).

-include("openapi.hrl").

-export([openapi_ad_account_create_subscription_response/0]).

-export([openapi_ad_account_create_subscription_response/1]).

-export_type([openapi_ad_account_create_subscription_response/0]).

-type openapi_ad_account_create_subscription_response() ::
  [ {'ad_account_id', binary() }
  | {'api_version', binary() }
  | {'created_time', integer() }
  | {'cryptographic_algorithm', binary() }
  | {'cryptographic_key', binary() }
  | {'id', binary() }
  | {'lead_form_id', binary() }
  | {'user_account_id', binary() }
  | {'webhook_url', binary() }
  ].


openapi_ad_account_create_subscription_response() ->
    openapi_ad_account_create_subscription_response([]).

openapi_ad_account_create_subscription_response(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'api_version', binary() }
            , {'created_time', integer() }
            , {'cryptographic_algorithm', binary() }
            , {'cryptographic_key', binary() }
            , {'id', binary() }
            , {'lead_form_id', binary() }
            , {'user_account_id', binary() }
            , {'webhook_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

