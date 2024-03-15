-module(openapi_ad_account_create_subscription_response).

-include("openapi.hrl").

-export([openapi_ad_account_create_subscription_response/0]).

-export([openapi_ad_account_create_subscription_response/1]).

-export_type([openapi_ad_account_create_subscription_response/0]).

-type openapi_ad_account_create_subscription_response() ::
  [ {'id', binary() }
  | {'cryptographic_key', binary() }
  | {'cryptographic_algorithm', binary() }
  | {'created_time', integer() }
  ].


openapi_ad_account_create_subscription_response() ->
    openapi_ad_account_create_subscription_response([]).

openapi_ad_account_create_subscription_response(Fields) ->
  Default = [ {'id', binary() }
            , {'cryptographic_key', binary() }
            , {'cryptographic_algorithm', binary() }
            , {'created_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

