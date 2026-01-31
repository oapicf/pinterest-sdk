-module(openapi_media).

-include("openapi.hrl").

-export([openapi_media/0]).

-export([openapi_media/1]).

-export_type([openapi_media/0]).

-type openapi_media() ::
  [ {'media_id', binary() }
  | {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
  | {'status', openapi_media_upload_status:openapi_media_upload_status() }
  ].


openapi_media() ->
    openapi_media([]).

openapi_media(Fields) ->
  Default = [ {'media_id', binary() }
            , {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
            , {'status', openapi_media_upload_status:openapi_media_upload_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

