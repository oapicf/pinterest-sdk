-module(openapi_media_upload_type).

-include("openapi.hrl").

-export([openapi_media_upload_type/0]).

-export_type([openapi_media_upload_type/0]).

-type openapi_media_upload_type() ::
  binary().

openapi_media_upload_type() ->
  elements([<<"video">>]).

