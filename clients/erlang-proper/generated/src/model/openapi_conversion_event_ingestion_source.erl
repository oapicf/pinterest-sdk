-module(openapi_conversion_event_ingestion_source).

-include("openapi.hrl").

-export([openapi_conversion_event_ingestion_source/0]).

-export_type([openapi_conversion_event_ingestion_source/0]).

-type openapi_conversion_event_ingestion_source() ::
  binary().

openapi_conversion_event_ingestion_source() ->
  elements([<<"TAG">>, <<"MMP">>, <<"FILE_UPLOAD">>, <<"CONVERSIONS_API">>, <<"NATIVE">>]).

