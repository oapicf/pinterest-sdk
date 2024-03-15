-module(openapi_product_type1_filter).

-include("openapi.hrl").

-export([openapi_product_type1_filter/0]).

-export([openapi_product_type1_filter/1]).

-export_type([openapi_product_type1_filter/0]).

-type openapi_product_type1_filter() ::
  [ {'PRODUCT_TYPE_1', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  ].


openapi_product_type1_filter() ->
    openapi_product_type1_filter([]).

openapi_product_type1_filter(Fields) ->
  Default = [ {'PRODUCT_TYPE_1', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

