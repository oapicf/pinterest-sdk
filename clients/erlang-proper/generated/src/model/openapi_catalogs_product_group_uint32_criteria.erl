-module(openapi_catalogs_product_group_uint32_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_uint32_criteria/0]).

-export([openapi_catalogs_product_group_uint32_criteria/1]).

-export_type([openapi_catalogs_product_group_uint32_criteria/0]).

-type openapi_catalogs_product_group_uint32_criteria() ::
  [ {'negated', boolean() }
  | {'operator', binary() }
  | {'value', integer() }
  ].


openapi_catalogs_product_group_uint32_criteria() ->
    openapi_catalogs_product_group_uint32_criteria([]).

openapi_catalogs_product_group_uint32_criteria(Fields) ->
  Default = [ {'negated', boolean() }
            , {'operator', elements([<<"GREATER_THAN">>, <<"GREATER_THAN_OR_EQUALS">>, <<"LESS_THAN">>, <<"LESS_THAN_OR_EQUALS">>]) }
            , {'value', integer(0, 4294967295) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

