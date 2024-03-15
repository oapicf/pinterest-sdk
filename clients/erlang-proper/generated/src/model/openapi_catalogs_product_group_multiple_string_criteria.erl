-module(openapi_catalogs_product_group_multiple_string_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_multiple_string_criteria/0]).

-export([openapi_catalogs_product_group_multiple_string_criteria/1]).

-export_type([openapi_catalogs_product_group_multiple_string_criteria/0]).

-type openapi_catalogs_product_group_multiple_string_criteria() ::
  [ {'values', list(binary()) }
  | {'negated', boolean() }
  ].


openapi_catalogs_product_group_multiple_string_criteria() ->
    openapi_catalogs_product_group_multiple_string_criteria([]).

openapi_catalogs_product_group_multiple_string_criteria(Fields) ->
  Default = [ {'values', list(binary()) }
            , {'negated', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

