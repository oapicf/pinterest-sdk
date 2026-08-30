-module(openapi_ads_credit_redeem_create).

-include("openapi.hrl").

-export([openapi_ads_credit_redeem_create/0]).

-export([openapi_ads_credit_redeem_create/1]).

-export_type([openapi_ads_credit_redeem_create/0]).

-type openapi_ads_credit_redeem_create() ::
  [ {'offerCodeHash', binary() }
  | {'validateOnly', boolean() }
  ].


openapi_ads_credit_redeem_create() ->
    openapi_ads_credit_redeem_create([]).

openapi_ads_credit_redeem_create(Fields) ->
  Default = [ {'offerCodeHash', binary() }
            , {'validateOnly', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

