-module(openapi_media_upload_status).

-include("openapi.hrl").

-export([openapi_media_upload_status/0]).

-export_type([openapi_media_upload_status/0]).

-type openapi_media_upload_status() ::
  binary().

openapi_media_upload_status() ->
  elements([<<"registered">>, <<"processing">>, <<"succeeded">>, <<"failed">>]).

