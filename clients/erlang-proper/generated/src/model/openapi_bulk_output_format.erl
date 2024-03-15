-module(openapi_bulk_output_format).

-include("openapi.hrl").

-export([openapi_bulk_output_format/0]).

-export_type([openapi_bulk_output_format/0]).

-type openapi_bulk_output_format() ::
  binary().

openapi_bulk_output_format() ->
  elements([<<"CSV">>, <<"JSON">>]).

