-module(openapi_media_upload_details).

-include("openapi.hrl").

-export([openapi_media_upload_details/0]).

-export([openapi_media_upload_details/1]).

-export_type([openapi_media_upload_details/0]).

-type openapi_media_upload_details() ::
  [ {'media_id', binary() }
  | {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
  | {'status', openapi_media_upload_status:openapi_media_upload_status() }
  ].


openapi_media_upload_details() ->
    openapi_media_upload_details([]).

openapi_media_upload_details(Fields) ->
  Default = [ {'media_id', binary() }
            , {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
            , {'status', openapi_media_upload_status:openapi_media_upload_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

