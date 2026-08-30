-module(openapi_catalog_create).

-include("openapi.hrl").

-export([openapi_catalog_create/0]).

-export([openapi_catalog_create/1]).

-export_type([openapi_catalog_create/0]).

-type openapi_catalog_create() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'name', binary() }
  ].


openapi_catalog_create() ->
    openapi_catalog_create([]).

openapi_catalog_create(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

