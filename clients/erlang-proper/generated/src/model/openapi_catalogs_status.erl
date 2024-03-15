-module(openapi_catalogs_status).

-include("openapi.hrl").

-export([openapi_catalogs_status/0]).

-export_type([openapi_catalogs_status/0]).

-type openapi_catalogs_status() ::
  binary().

openapi_catalogs_status() ->
  elements([<<"ACTIVE">>, <<"INACTIVE">>]).

