-module(openapi_ads_credit_redeem_response).

-include("openapi.hrl").

-export([openapi_ads_credit_redeem_response/0]).

-export([openapi_ads_credit_redeem_response/1]).

-export_type([openapi_ads_credit_redeem_response/0]).

-type openapi_ads_credit_redeem_response() ::
  [ {'errorCode', integer() }
  | {'errorMessage', binary() }
  | {'success', boolean() }
  ].


openapi_ads_credit_redeem_response() ->
    openapi_ads_credit_redeem_response([]).

openapi_ads_credit_redeem_response(Fields) ->
  Default = [ {'errorCode', integer() }
            , {'errorMessage', binary() }
            , {'success', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

