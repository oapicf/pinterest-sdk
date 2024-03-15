-module(openapi_catalogs_format).

-include("openapi.hrl").

-export([openapi_catalogs_format/0]).

-export_type([openapi_catalogs_format/0]).

-type openapi_catalogs_format() ::
  binary().

openapi_catalogs_format() ->
  elements([<<"TSV">>, <<"CSV">>, <<"XML">>]).

