-module(openapi_country_filter).

-include("openapi.hrl").

-export([openapi_country_filter/0]).

-export([openapi_country_filter/1]).

-export_type([openapi_country_filter/0]).

-type openapi_country_filter() ::
  [ {'COUNTRY', openapi_catalogs_product_group_multiple_countries_criteria:openapi_catalogs_product_group_multiple_countries_criteria() }
  ].


openapi_country_filter() ->
    openapi_country_filter([]).

openapi_country_filter(Fields) ->
  Default = [ {'COUNTRY', openapi_catalogs_product_group_multiple_countries_criteria:openapi_catalogs_product_group_multiple_countries_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

