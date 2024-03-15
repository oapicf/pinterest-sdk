-module(openapi_ad_accounts_subscriptions_get_list_200_response).

-include("openapi.hrl").

-export([openapi_ad_accounts_subscriptions_get_list_200_response/0]).

-export([openapi_ad_accounts_subscriptions_get_list_200_response/1]).

-export_type([openapi_ad_accounts_subscriptions_get_list_200_response/0]).

-type openapi_ad_accounts_subscriptions_get_list_200_response() ::
  [ {'items', list(openapi_ad_account_get_subscription_response:openapi_ad_account_get_subscription_response()) }
  | {'bookmark', binary() }
  ].


openapi_ad_accounts_subscriptions_get_list_200_response() ->
    openapi_ad_accounts_subscriptions_get_list_200_response([]).

openapi_ad_accounts_subscriptions_get_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_ad_account_get_subscription_response:openapi_ad_account_get_subscription_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

