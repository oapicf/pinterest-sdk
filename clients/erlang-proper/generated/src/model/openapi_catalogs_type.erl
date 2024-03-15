-module(openapi_catalogs_type).

-include("openapi.hrl").

-export([openapi_catalogs_type/0]).

-export_type([openapi_catalogs_type/0]).

-type openapi_catalogs_type() ::
  binary().

openapi_catalogs_type() ->
  elements([<<"RETAIL">>, <<"HOTEL">>]).

