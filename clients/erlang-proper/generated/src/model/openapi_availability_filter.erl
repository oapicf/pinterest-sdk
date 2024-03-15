-module(openapi_availability_filter).

-include("openapi.hrl").

-export([openapi_availability_filter/0]).

-export([openapi_availability_filter/1]).

-export_type([openapi_availability_filter/0]).

-type openapi_availability_filter() ::
  [ {'AVAILABILITY', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_availability_filter() ->
    openapi_availability_filter([]).

openapi_availability_filter(Fields) ->
  Default = [ {'AVAILABILITY', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

