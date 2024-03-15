-module(openapi_media_upload_request).

-include("openapi.hrl").

-export([openapi_media_upload_request/0]).

-export([openapi_media_upload_request/1]).

-export_type([openapi_media_upload_request/0]).

-type openapi_media_upload_request() ::
  [ {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
  ].


openapi_media_upload_request() ->
    openapi_media_upload_request([]).

openapi_media_upload_request(Fields) ->
  Default = [ {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

