-module(openapi_custom_number1_filter).

-include("openapi.hrl").

-export([openapi_custom_number1_filter/0]).

-export([openapi_custom_number1_filter/1]).

-export_type([openapi_custom_number1_filter/0]).

-type openapi_custom_number1_filter() ::
  [ {'CUSTOM_NUMBER_1', openapi_catalogs_product_group_uint32_criteria:openapi_catalogs_product_group_uint32_criteria() }
  ].


openapi_custom_number1_filter() ->
    openapi_custom_number1_filter([]).

openapi_custom_number1_filter(Fields) ->
  Default = [ {'CUSTOM_NUMBER_1', openapi_catalogs_product_group_uint32_criteria:openapi_catalogs_product_group_uint32_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

