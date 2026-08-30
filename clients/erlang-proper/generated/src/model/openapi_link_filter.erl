-module(openapi_link_filter).

-include("openapi.hrl").

-export([openapi_link_filter/0]).

-export([openapi_link_filter/1]).

-export_type([openapi_link_filter/0]).

-type openapi_link_filter() ::
  [ {'LINK', openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria() }
  ].


openapi_link_filter() ->
    openapi_link_filter([]).

openapi_link_filter(Fields) ->
  Default = [ {'LINK', openapi_catalogs_product_group_filter_operator_type_criteria:openapi_catalogs_product_group_filter_operator_type_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

