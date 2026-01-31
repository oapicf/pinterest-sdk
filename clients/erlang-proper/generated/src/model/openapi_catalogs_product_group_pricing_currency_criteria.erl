-module(openapi_catalogs_product_group_pricing_currency_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_pricing_currency_criteria/0]).

-export([openapi_catalogs_product_group_pricing_currency_criteria/1]).

-export_type([openapi_catalogs_product_group_pricing_currency_criteria/0]).

-type openapi_catalogs_product_group_pricing_currency_criteria() ::
  [ {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
  | {'negated', boolean() }
  | {'operator', binary() }
  | {'value', integer() }
  ].


openapi_catalogs_product_group_pricing_currency_criteria() ->
    openapi_catalogs_product_group_pricing_currency_criteria([]).

openapi_catalogs_product_group_pricing_currency_criteria(Fields) ->
  Default = [ {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
            , {'negated', boolean() }
            , {'operator', elements([<<"GREATER_THAN">>, <<"GREATER_THAN_OR_EQUALS">>, <<"LESS_THAN">>, <<"LESS_THAN_OR_EQUALS">>]) }
            , {'value', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

