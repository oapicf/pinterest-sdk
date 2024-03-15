-module(openapi_ads_credit_redeem_response).

-include("openapi.hrl").

-export([openapi_ads_credit_redeem_response/0]).

-export([openapi_ads_credit_redeem_response/1]).

-export_type([openapi_ads_credit_redeem_response/0]).

-type openapi_ads_credit_redeem_response() ::
  [ {'success', boolean() }
  | {'errorCode', integer() }
  | {'errorMessage', binary() }
  ].


openapi_ads_credit_redeem_response() ->
    openapi_ads_credit_redeem_response([]).

openapi_ads_credit_redeem_response(Fields) ->
  Default = [ {'success', boolean() }
            , {'errorCode', integer() }
            , {'errorMessage', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

