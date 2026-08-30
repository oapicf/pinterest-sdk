-module(openapi_ingestion_source).

-include("openapi.hrl").

-export([openapi_ingestion_source/0]).

-export_type([openapi_ingestion_source/0]).

-type openapi_ingestion_source() ::
  binary().

openapi_ingestion_source() ->
  elements([<<"TAG">>, <<"MMP">>, <<"FILE_UPLOAD">>, <<"CONVERSIONS_API">>, <<"NATIVE">>]).

