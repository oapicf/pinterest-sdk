-module(openapi_catalog_update).

-include("openapi.hrl").

-export([openapi_catalog_update/0]).

-export([openapi_catalog_update/1]).

-export_type([openapi_catalog_update/0]).

-type openapi_catalog_update() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'name', binary() }
  ].


openapi_catalog_update() ->
    openapi_catalog_update([]).

openapi_catalog_update(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

