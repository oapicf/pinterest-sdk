-module(openapi_price_filter_price).

-include("openapi.hrl").

-export([openapi_price_filter_price/0]).

-export([openapi_price_filter_price/1]).

-export_type([openapi_price_filter_price/0]).

-type openapi_price_filter_price() ::
  [ {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
  | {'negated', boolean() }
  | {'operator', openapi_numeric_filter_operator_type:openapi_numeric_filter_operator_type() }
  | {'value', integer() }
  ].


openapi_price_filter_price() ->
    openapi_price_filter_price([]).

openapi_price_filter_price(Fields) ->
  Default = [ {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
            , {'negated', boolean() }
            , {'operator', openapi_numeric_filter_operator_type:openapi_numeric_filter_operator_type() }
            , {'value', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

