-module(openapi_catalog).

-include("openapi.hrl").

-export([openapi_catalog/0]).

-export([openapi_catalog/1]).

-export_type([openapi_catalog/0]).

-type openapi_catalog() ::
  [ {'created_at', datetime() }
  | {'id', binary() }
  | {'updated_at', datetime() }
  | {'name', binary() }
  | {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  ].


openapi_catalog() ->
    openapi_catalog([]).

openapi_catalog(Fields) ->
  Default = [ {'created_at', datetime() }
            , {'id', binary() }
            , {'updated_at', datetime() }
            , {'name', binary() }
            , {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

