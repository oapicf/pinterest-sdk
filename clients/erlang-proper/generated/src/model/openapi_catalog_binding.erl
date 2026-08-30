-module(openapi_catalog_binding).

-include("openapi.hrl").

-export([openapi_catalog_binding/0]).

-export([openapi_catalog_binding/1]).

-export_type([openapi_catalog_binding/0]).

-type openapi_catalog_binding() ::
  [ {'catalog_type', binary() }
  | {'id', binary() }
  | {'name', binary() }
  ].


openapi_catalog_binding() ->
    openapi_catalog_binding([]).

openapi_catalog_binding(Fields) ->
  Default = [ {'catalog_type', binary() }
            , {'id', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

