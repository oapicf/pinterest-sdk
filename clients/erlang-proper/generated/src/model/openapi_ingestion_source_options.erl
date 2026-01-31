-module(openapi_ingestion_source_options).

-include("openapi.hrl").

-export([openapi_ingestion_source_options/0]).

-export_type([openapi_ingestion_source_options/0]).

-type openapi_ingestion_source_options() ::
  binary().

openapi_ingestion_source_options() ->
  elements([<<"TAG">>, <<"MMP">>, <<"FILE_UPLOAD">>, <<"CONVERSIONS_API">>, <<"NATIVE">>]).

