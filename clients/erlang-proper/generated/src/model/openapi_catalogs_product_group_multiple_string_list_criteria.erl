-module(openapi_catalogs_product_group_multiple_string_list_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_multiple_string_list_criteria/0]).

-export([openapi_catalogs_product_group_multiple_string_list_criteria/1]).

-export_type([openapi_catalogs_product_group_multiple_string_list_criteria/0]).

-type openapi_catalogs_product_group_multiple_string_list_criteria() ::
  [ {'values', list(list(binary())) }
  | {'negated', boolean() }
  ].


openapi_catalogs_product_group_multiple_string_list_criteria() ->
    openapi_catalogs_product_group_multiple_string_list_criteria([]).

openapi_catalogs_product_group_multiple_string_list_criteria(Fields) ->
  Default = [ {'values', list(list(binary())) }
            , {'negated', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

