-module(openapi_catalogs_local_stores_create_200_response_inner_data_one_of).

-include("openapi.hrl").

-export([openapi_catalogs_local_stores_create_200_response_inner_data_one_of/0]).

-export([openapi_catalogs_local_stores_create_200_response_inner_data_one_of/1]).

-export_type([openapi_catalogs_local_stores_create_200_response_inner_data_one_of/0]).

-type openapi_catalogs_local_stores_create_200_response_inner_data_one_of() ::
  [ {'id', binary() }
  | {'exceptions', openapi_pinterest_lib_error:openapi_pinterest_lib_error() }
  ].


openapi_catalogs_local_stores_create_200_response_inner_data_one_of() ->
    openapi_catalogs_local_stores_create_200_response_inner_data_one_of([]).

openapi_catalogs_local_stores_create_200_response_inner_data_one_of(Fields) ->
  Default = [ {'id', binary() }
            , {'exceptions', openapi_pinterest_lib_error:openapi_pinterest_lib_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

