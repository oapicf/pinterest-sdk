-module(openapi_data_output_format).

-include("openapi.hrl").

-export([openapi_data_output_format/0]).

-export_type([openapi_data_output_format/0]).

-type openapi_data_output_format() ::
  binary().

openapi_data_output_format() ->
  elements([<<"JSON">>, <<"CSV">>]).

