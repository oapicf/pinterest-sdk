-module(openapi_media_upload).

-include("openapi.hrl").

-export([openapi_media_upload/0]).

-export([openapi_media_upload/1]).

-export_type([openapi_media_upload/0]).

-type openapi_media_upload() ::
  [ {'media_id', binary() }
  | {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
  | {'upload_parameters', openapi_media_upload_parameters:openapi_media_upload_parameters() }
  | {'upload_url', binary() }
  ].


openapi_media_upload() ->
    openapi_media_upload([]).

openapi_media_upload(Fields) ->
  Default = [ {'media_id', binary() }
            , {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
            , {'upload_parameters', openapi_media_upload_parameters:openapi_media_upload_parameters() }
            , {'upload_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

