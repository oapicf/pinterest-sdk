-module(openapi_ads_credit_redeem).

-include("openapi.hrl").

-export([openapi_ads_credit_redeem/0]).

-export([openapi_ads_credit_redeem/1]).

-export_type([openapi_ads_credit_redeem/0]).

-type openapi_ads_credit_redeem() ::
  [ {'errorCode', integer() }
  | {'errorMessage', binary() }
  | {'success', boolean() }
  ].


openapi_ads_credit_redeem() ->
    openapi_ads_credit_redeem([]).

openapi_ads_credit_redeem(Fields) ->
  Default = [ {'errorCode', integer() }
            , {'errorMessage', binary() }
            , {'success', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

