-module(openapi_catalogs_base_filters_all_of).

-include("openapi.hrl").

-export([openapi_catalogs_base_filters_all_of/0]).

-export([openapi_catalogs_base_filters_all_of/1]).

-export_type([openapi_catalogs_base_filters_all_of/0]).

-type openapi_catalogs_base_filters_all_of() ::
  [ {'all_of', list(openapi_catalogs_base_filter_keys:openapi_catalogs_base_filter_keys()) }
  ].


openapi_catalogs_base_filters_all_of() ->
    openapi_catalogs_base_filters_all_of([]).

openapi_catalogs_base_filters_all_of(Fields) ->
  Default = [ {'all_of', list(openapi_catalogs_base_filter_keys:openapi_catalogs_base_filter_keys(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

