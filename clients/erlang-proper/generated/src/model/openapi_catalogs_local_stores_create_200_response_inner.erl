-module(openapi_catalogs_local_stores_create_200_response_inner).

-include("openapi.hrl").

-export([openapi_catalogs_local_stores_create_200_response_inner/0]).

-export([openapi_catalogs_local_stores_create_200_response_inner/1]).

-export_type([openapi_catalogs_local_stores_create_200_response_inner/0]).

-type openapi_catalogs_local_stores_create_200_response_inner() ::
  [ {'data', openapi_catalogs_local_stores_create_200_response_inner_data:openapi_catalogs_local_stores_create_200_response_inner_data() }
  ].


openapi_catalogs_local_stores_create_200_response_inner() ->
    openapi_catalogs_local_stores_create_200_response_inner([]).

openapi_catalogs_local_stores_create_200_response_inner(Fields) ->
  Default = [ {'data', openapi_catalogs_local_stores_create_200_response_inner_data:openapi_catalogs_local_stores_create_200_response_inner_data() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

