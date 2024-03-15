-module(openapi_gender_filter).

-include("openapi.hrl").

-export([openapi_gender_filter/0]).

-export([openapi_gender_filter/1]).

-export_type([openapi_gender_filter/0]).

-type openapi_gender_filter() ::
  [ {'GENDER', openapi_catalogs_product_group_multiple_gender_criteria:openapi_catalogs_product_group_multiple_gender_criteria() }
  ].


openapi_gender_filter() ->
    openapi_gender_filter([]).

openapi_gender_filter(Fields) ->
  Default = [ {'GENDER', openapi_catalogs_product_group_multiple_gender_criteria:openapi_catalogs_product_group_multiple_gender_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

