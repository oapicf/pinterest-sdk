-module(openapi_brand_filter).

-include("openapi.hrl").

-export([openapi_brand_filter/0]).

-export([openapi_brand_filter/1]).

-export_type([openapi_brand_filter/0]).

-type openapi_brand_filter() ::
  [ {'BRAND', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_brand_filter() ->
    openapi_brand_filter([]).

openapi_brand_filter(Fields) ->
  Default = [ {'BRAND', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

