-module(openapi_supplemental_item_processing_status).

-include("openapi.hrl").

-export([openapi_supplemental_item_processing_status/0]).

-export_type([openapi_supplemental_item_processing_status/0]).

-type openapi_supplemental_item_processing_status() ::
  binary().

openapi_supplemental_item_processing_status() ->
  elements([<<"SUCCESS">>, <<"FAILURE">>, <<"PROCESSING">>]).

