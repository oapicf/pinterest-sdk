-module(openapi_custom_label0_filter).

-include("openapi.hrl").

-export([openapi_custom_label0_filter/0]).

-export([openapi_custom_label0_filter/1]).

-export_type([openapi_custom_label0_filter/0]).

-type openapi_custom_label0_filter() ::
  [ {'CUSTOM_LABEL_0', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_custom_label0_filter() ->
    openapi_custom_label0_filter([]).

openapi_custom_label0_filter(Fields) ->
  Default = [ {'CUSTOM_LABEL_0', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

