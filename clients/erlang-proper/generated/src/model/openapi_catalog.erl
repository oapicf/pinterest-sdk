-module(openapi_catalog).

-include("openapi.hrl").

-export([openapi_catalog/0]).

-export([openapi_catalog/1]).

-export_type([openapi_catalog/0]).

-type openapi_catalog() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'created_at', datetime() }
  | {'id', binary() }
  | {'name', binary() }
  | {'updated_at', datetime() }
  ].


openapi_catalog() ->
    openapi_catalog([]).

openapi_catalog(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'created_at', datetime() }
            , {'id', binary() }
            , {'name', binary() }
            , {'updated_at', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

