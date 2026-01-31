-module(openapi_catalogs_product_group_filter_operator_type_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_filter_operator_type_criteria/0]).

-export([openapi_catalogs_product_group_filter_operator_type_criteria/1]).

-export_type([openapi_catalogs_product_group_filter_operator_type_criteria/0]).

-type openapi_catalogs_product_group_filter_operator_type_criteria() ::
  [ {'filter_operator_type', binary() }
  | {'negated', boolean() }
  | {'values', list(binary()) }
  ].


openapi_catalogs_product_group_filter_operator_type_criteria() ->
    openapi_catalogs_product_group_filter_operator_type_criteria([]).

openapi_catalogs_product_group_filter_operator_type_criteria(Fields) ->
  Default = [ {'filter_operator_type', elements([<<"IS">>, <<"CONTAINS">>]) }
            , {'negated', boolean() }
            , {'values', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

