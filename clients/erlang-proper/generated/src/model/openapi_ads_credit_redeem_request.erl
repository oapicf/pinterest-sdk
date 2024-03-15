-module(openapi_ads_credit_redeem_request).

-include("openapi.hrl").

-export([openapi_ads_credit_redeem_request/0]).

-export([openapi_ads_credit_redeem_request/1]).

-export_type([openapi_ads_credit_redeem_request/0]).

-type openapi_ads_credit_redeem_request() ::
  [ {'offerCodeHash', binary() }
  | {'validateOnly', boolean() }
  ].


openapi_ads_credit_redeem_request() ->
    openapi_ads_credit_redeem_request([]).

openapi_ads_credit_redeem_request(Fields) ->
  Default = [ {'offerCodeHash', binary() }
            , {'validateOnly', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

