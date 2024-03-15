-module(openapi_custom_label2_filter).

-include("openapi.hrl").

-export([openapi_custom_label2_filter/0]).

-export([openapi_custom_label2_filter/1]).

-export_type([openapi_custom_label2_filter/0]).

-type openapi_custom_label2_filter() ::
  [ {'CUSTOM_LABEL_2', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_custom_label2_filter() ->
    openapi_custom_label2_filter([]).

openapi_custom_label2_filter(Fields) ->
  Default = [ {'CUSTOM_LABEL_2', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

