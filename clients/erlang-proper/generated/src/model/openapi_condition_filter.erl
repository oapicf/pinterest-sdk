-module(openapi_condition_filter).

-include("openapi.hrl").

-export([openapi_condition_filter/0]).

-export([openapi_condition_filter/1]).

-export_type([openapi_condition_filter/0]).

-type openapi_condition_filter() ::
  [ {'CONDITION', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_condition_filter() ->
    openapi_condition_filter([]).

openapi_condition_filter(Fields) ->
  Default = [ {'CONDITION', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

