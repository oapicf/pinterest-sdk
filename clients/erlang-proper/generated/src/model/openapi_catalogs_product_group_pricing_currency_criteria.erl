-module(openapi_catalogs_product_group_pricing_currency_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_pricing_currency_criteria/0]).

-export([openapi_catalogs_product_group_pricing_currency_criteria/1]).

-export_type([openapi_catalogs_product_group_pricing_currency_criteria/0]).

-type openapi_catalogs_product_group_pricing_currency_criteria() ::
  [ {'operator', binary() }
  | {'value', integer() }
  | {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
  | {'negated', boolean() }
  ].


openapi_catalogs_product_group_pricing_currency_criteria() ->
    openapi_catalogs_product_group_pricing_currency_criteria([]).

openapi_catalogs_product_group_pricing_currency_criteria(Fields) ->
  Default = [ {'operator', elements([<<"GREATER_THAN">>, <<"GREATER_THAN_OR_EQUALS">>, <<"LESS_THAN">>, <<"LESS_THAN_OR_EQUALS">>]) }
            , {'value', integer() }
            , {'currency', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
            , {'negated', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

