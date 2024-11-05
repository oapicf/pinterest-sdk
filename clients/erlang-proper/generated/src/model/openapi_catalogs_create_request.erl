-module(openapi_catalogs_create_request).

-include("openapi.hrl").

-export([openapi_catalogs_create_request/0]).

-export([openapi_catalogs_create_request/1]).

-export_type([openapi_catalogs_create_request/0]).

-type openapi_catalogs_create_request() ::
  [ {'catalog_type', binary() }
  | {'name', binary() }
  ].


openapi_catalogs_create_request() ->
    openapi_catalogs_create_request([]).

openapi_catalogs_create_request(Fields) ->
  Default = [ {'catalog_type', elements([<<"HOTEL">>]) }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

