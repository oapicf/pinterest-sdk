-module(openapi_product_group_reference_filter).

-include("openapi.hrl").

-export([openapi_product_group_reference_filter/0]).

-export([openapi_product_group_reference_filter/1]).

-export_type([openapi_product_group_reference_filter/0]).

-type openapi_product_group_reference_filter() ::
  [ {'PRODUCT_GROUP', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_product_group_reference_filter() ->
    openapi_product_group_reference_filter([]).

openapi_product_group_reference_filter(Fields) ->
  Default = [ {'PRODUCT_GROUP', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

