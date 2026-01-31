-module(openapi_catalogs_retail_available_filter_values).

-include("openapi.hrl").

-export([openapi_catalogs_retail_available_filter_values/0]).

-export([openapi_catalogs_retail_available_filter_values/1]).

-export_type([openapi_catalogs_retail_available_filter_values/0]).

-type openapi_catalogs_retail_available_filter_values() ::
  [ {'catalog_type', binary() }
  | {'filter_values', openapi_catalogs_retail_filter_values_map:openapi_catalogs_retail_filter_values_map() }
  ].


openapi_catalogs_retail_available_filter_values() ->
    openapi_catalogs_retail_available_filter_values([]).

openapi_catalogs_retail_available_filter_values(Fields) ->
  Default = [ {'catalog_type', elements([<<"RETAIL">>]) }
            , {'filter_values', openapi_catalogs_retail_filter_values_map:openapi_catalogs_retail_filter_values_map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

