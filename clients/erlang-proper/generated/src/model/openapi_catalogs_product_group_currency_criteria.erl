-module(openapi_catalogs_product_group_currency_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_currency_criteria/0]).

-export([openapi_catalogs_product_group_currency_criteria/1]).

-export_type([openapi_catalogs_product_group_currency_criteria/0]).

-type openapi_catalogs_product_group_currency_criteria() ::
  [ {'values', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
  | {'negated', boolean() }
  ].


openapi_catalogs_product_group_currency_criteria() ->
    openapi_catalogs_product_group_currency_criteria([]).

openapi_catalogs_product_group_currency_criteria(Fields) ->
  Default = [ {'values', openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency() }
            , {'negated', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

