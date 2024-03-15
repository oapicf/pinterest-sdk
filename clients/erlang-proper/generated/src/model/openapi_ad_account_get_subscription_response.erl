-module(openapi_ad_account_get_subscription_response).

-include("openapi.hrl").

-export([openapi_ad_account_get_subscription_response/0]).

-export([openapi_ad_account_get_subscription_response/1]).

-export_type([openapi_ad_account_get_subscription_response/0]).

-type openapi_ad_account_get_subscription_response() ::
  [ {'lead_form_id', binary() }
  | {'webhook_url', binary() }
  | {'id', binary() }
  | {'user_account_id', binary() }
  | {'ad_account_id', binary() }
  | {'api_version', binary() }
  | {'cryptographic_key', binary() }
  | {'cryptographic_algorithm', binary() }
  | {'created_time', integer() }
  ].


openapi_ad_account_get_subscription_response() ->
    openapi_ad_account_get_subscription_response([]).

openapi_ad_account_get_subscription_response(Fields) ->
  Default = [ {'lead_form_id', binary() }
            , {'webhook_url', binary() }
            , {'id', binary() }
            , {'user_account_id', binary() }
            , {'ad_account_id', binary() }
            , {'api_version', binary() }
            , {'cryptographic_key', binary() }
            , {'cryptographic_algorithm', binary() }
            , {'created_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

